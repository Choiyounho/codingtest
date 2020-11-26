package programers.level1;

public class BetweenSum {

    public long solution(int a, int b) {
        long answer = 0;

        if (b > a) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        if (a == b) {
            answer = a;
        }

        return answer;
    }

}

