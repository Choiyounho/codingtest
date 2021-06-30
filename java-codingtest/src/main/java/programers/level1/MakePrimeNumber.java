package programers.level1;

public class MakePrimeNumber {

    public int solution(int[] nums) {
        return findPrimeNumber(nums);
    }

    private int findPrimeNumber(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {// 3중 포문 가독성 -> 재귀로 재풀이
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    boolean isPrime = isPrime(nums[i] + nums[j] + nums[k]);
                    if (isPrime) {
                        count++;
                    }
                }
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
