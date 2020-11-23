package programers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//가장 작은 수 제거
public class RemoveSmallestNumber {

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Integer min = Collections.min(numbers);

        while (numbers.contains(min)) {
            numbers.remove(min);
        }

        int[] answer = new int[numbers.size()];

        for (int k = 0; k < numbers.size(); k++) {
            answer[k] = numbers.get(k);
        }

        return answer;
    }

}
