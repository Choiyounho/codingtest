package programers.level2;

public class FibonacciNumbers {

    public int solution(int n) {

        int f = fibonacci(n);

        return f % 1234567;
    }

    private int fibonacci(int n) {
        int[] f = {0, 1};

        int fibo = 1234567;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum = f[0] % fibo + f[1] % fibo;
                f[0] = sum;
            }
            if (i % 2 == 1) {
                sum = f[0] % fibo + f[1] % fibo;
                f[1] = sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();

        System.out.println(fibonacciNumbers.solution(44));
    }
}
