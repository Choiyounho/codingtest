package programers.level1;

import java.util.stream.IntStream;

// x만큼 간격이 있는 n개의 숫자
public class ArithmeticProgression {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        return calculateNumbers(x, n, answer);
    }

    public long[] solution2(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        IntStream.range(1, n).forEach(i -> answer[i] = answer[i - 1] + x);
        return answer;
    }

    private long[] calculateNumbers(int x, int n, long[] answer) {
        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }

        return answer;
    }

}
