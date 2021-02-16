package programers.level1;

import java.util.Arrays;

public class MinimumAndMaximum {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if (m % n == 0 || n % m == 0) {
            if (n > m) {
                return new int[]{m, n};
            }
            if (m > n) {
                return new int[]{n, m};
            }
        }

        for (int i = 1; i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        answer[1] = (n * m) / answer[0];

        return answer;
    }

    public static void main(String[] args) {
        MinimumAndMaximum minimumAndMaximum = new MinimumAndMaximum();

        System.out.println(Arrays.toString(minimumAndMaximum.solution(36, 48)));
    }
}
