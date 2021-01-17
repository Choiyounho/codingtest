package codility;

/*
    로테이션 수 만큼 배열 이동
    맨 마지막 요소는 가장 앞으로 이동
 */
public class CyclicRotation {

    public int[] solution(int[] numbers, int rotation) {
        int size = numbers.length;
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            temp[convertIndex(i + rotation, size)] = numbers[i];
        }

        return temp;
    }

    private int convertIndex(int number, int size) {
        if (number > size - 1) {
            return number % size;
        }
        return number;
    }

    public int[] solution1(int[] numbers, int rotation) {
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
