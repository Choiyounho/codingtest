package codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] numbers = {3, 8, 9, 7, 6};
        int rotation = 3;

        CyclicRotation cyclicRotation = new CyclicRotation();
        System.out.println(Arrays.toString(cyclicRotation.solution(numbers, rotation)));
    }

    public int[] solution(int[] numbers, int rotation) {
        int length = numbers.length;
        int cycle = rotation % length;

        for (int i = 0; i < cycle; i++) {
            numbers = moveIndex(numbers);
        }

        return numbers;
    }

    private int[] moveIndex(int[] numbers) {
        int[] addZeroArrays = new int[numbers.length + 1];

        for (int i = 1; i < addZeroArrays.length; i++) {
            addZeroArrays[i] = numbers[i - 1];
        }

        addZeroArrays[0] = addZeroArrays[addZeroArrays.length - 1];

        int[] results = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            results[i] = addZeroArrays[i];
        }
        return results;
    }

}
