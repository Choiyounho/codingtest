package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    3개의 숫자로만 이루어진 배열이 있다.
    그 중 숫자 두 개는 중복 되어있고, 나머지 한개의 숫자는 배열에서 딱 한개다.
    그 하나인 요소를 구하라
 */
public class OddOccurrencesInArray {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i += 2) {
            if (numbers[i] != numbers[i + 1]) {
                return numbers[i];
            }
        }

        return numbers[numbers.length - 1];
    }

    public int solution1(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            list.add(number);
        }

        int i = 0;

        while (true) {
            i = list.get(0);
            list.remove(0);
            if (!list.contains(i)) {
                return i;
            }
            list.add(i);
        }
    }

}
