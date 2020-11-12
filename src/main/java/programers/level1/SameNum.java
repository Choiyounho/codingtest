package programers.level1;

import java.util.ArrayList;
import java.util.List;

public class SameNum {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                continue;
            }
            if (list.get(list.size() -1 ) != arr[i]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }

}
