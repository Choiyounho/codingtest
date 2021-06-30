package programers.level1;

import java.util.Arrays;

public class Budget {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];

            if (budget == sum) {
                return i + 1;
            }
            if (budget < sum) {
                return i;
            }
        }

        throw new IllegalArgumentException();
    }

}
