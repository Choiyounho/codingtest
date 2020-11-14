package programers.level1;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOrder {

    public long solution(long n) {
        String[] longNums = String.valueOf(n).split("");

        Arrays.sort(longNums, Collections.reverseOrder());

        String longNum = "";

        for (String num : longNums) {
            longNum += num;
        }

        return Long.parseLong(longNum);
    }

}
