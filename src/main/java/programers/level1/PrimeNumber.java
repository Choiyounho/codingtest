package programers.level1;

// 소수 구하기
public class PrimeNumber {

    public int solution(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int i) {
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
