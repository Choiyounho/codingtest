package programers.level1;

// 정수 제곱근 판별
public class DiscriminationSquareRoot {

    public long solution(long n) {
        if (Math.sqrt(n) == (long) Math.sqrt(n)) {
            return (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        }

        return -1;
    }

}
