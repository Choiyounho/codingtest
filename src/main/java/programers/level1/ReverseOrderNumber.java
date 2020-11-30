package programers.level1;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOrderNumber {

    public long solution(long n) {
        String[] longNums = String.valueOf(n).split("");

        Arrays.sort(longNums, Collections.reverseOrder());

        StringBuilder longNum = new StringBuilder();

        for (String num : longNums) {
            longNum.append(num);
        }

        return Long.parseLong(longNum.toString());
    }

}
