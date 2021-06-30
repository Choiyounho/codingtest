package programers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordChange {

    private List<Integer> countList;

    public int solution(String begin, String target, String[] words) {
        boolean filter = false;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                filter = true;
            }
        }
        if (!filter) {
            return 0;
        }

        countList = new ArrayList<>();

        List<String> list = new ArrayList<>(Arrays.asList(words));

        int size = list.size();

        boolean[] isVisited = new boolean[words.length];
        dfs(begin, target, list, 0, size, isVisited);

        // 단어가 완성되지 않을 때
        if (countList.isEmpty()) {
            return 0;
        }

        // countList 중에서 가장 작은 요소 추출
        return Collections.min(countList);
    }

    private void dfs(String begin, String target, List<String> list, int count, int size, boolean[] isVisited) {
        count++;

        int diffCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (isVisited[i]) {
                continue;
            }

            for (int j = 0; j < target.length(); j++) {
                if (begin.charAt(j) != list.get(i).charAt(j)) {
                    diffCount++;
                }
            }

            if (diffCount == 1) {
                String begin2 = list.get(i);
                if (begin2.equals(target)) {
                    countList.add(count);
                    return;
                }

                if (count == size) {
                    return;
                }

                isVisited[i] = true;

                dfs(begin2, target, list, count, size, isVisited);
            }

            diffCount = 0;
        }
    }

}
