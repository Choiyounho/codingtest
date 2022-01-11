package programers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Press {

    Map<String, Integer> map = new HashMap<>();
    List<Integer> answerList = new ArrayList<>();

    public int[] solution(String msg) {
        int[] answer;

        initMap();
        String currentWord = "";
        String nextWord = "";
        int num;

        for (int i = 0; i < msg.length(); i++) {
            currentWord += msg.charAt(i);

            num = getIndex(currentWord);

            if (i + 1 < msg.length()) { // 추가해야할 문자남은 경우
                nextWord = "" + msg.charAt(i + 1);
                String word = currentWord + nextWord;
                if (getIndex(word) != -1) {
                    continue;
                }
                currentWord = word;
            }
            answerList.add(num);
            map.put(currentWord, map.size() + 1);

            currentWord = "";
        }

        answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private void initMap() {
        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(c + "", i);
            c++;
        }
    }

    private int getIndex(String str) {
        int num = -1;
        if (map.containsKey(str)) {
            num = map.get(str);
        }
        return num;
    }

    public static void main(String[] args) {
        Press p = new Press();
        p.solution("TOBEORNOTTOBEORTOBEORNOT");
    }

}
