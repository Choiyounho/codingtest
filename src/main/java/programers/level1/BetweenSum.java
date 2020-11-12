package programers.level1;

public class BetweenSum {

    public long solution(int a, int b) {
        int sum = 0;

        if (b > a) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }
        if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        if (a == b) {
            sum = a;
        }

        long answer = sum;

        return answer;
    }

}

