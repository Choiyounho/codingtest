package codility;

import java.util.ArrayList;
import java.util.List;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] numbers = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
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
