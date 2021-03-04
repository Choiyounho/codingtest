package programers.level1;

// 최소공배수와 최대공약수
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

}
