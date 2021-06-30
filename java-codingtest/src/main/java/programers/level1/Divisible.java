package programers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class Divisible {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(arr);

        addDivisible(arr, divisor, list);

        if (list.size() == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];

        calculateNumbers(list, answer);

        return answer;
    }

    private void calculateNumbers(List<Integer> list, int[] answer) {
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
    }

    private void addDivisible(int[] arr, int divisor, List<Integer> list) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
    }

}
