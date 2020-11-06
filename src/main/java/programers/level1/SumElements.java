package programers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumElements {

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int element = numbers[i] + numbers[j];
                if (!list.contains(element)) {
                    list.add(element);
                }
            }
        }

        int[] output = new int[list.size()];

        for (int i = 0; i < output.length; i++) {
            output[i] = list.get(i);
        }

        Arrays.sort(output);

        return output;
    }

    public static void main(String[] args) {

        int[] input = {2, 1, 3, 4, 1};

        System.out.println(Arrays.toString(solution(input)));

    }


}
