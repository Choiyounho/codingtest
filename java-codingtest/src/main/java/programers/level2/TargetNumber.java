package programers.level2;

public class TargetNumber {

    private static int result = 0;

    public static void main(String[] args) {

    }

    public int solution(int[] numbers, int target) {
        DFS(numbers, 0, 0, target);

        return result;
    }

    public void DFS(int[] numbers, int sum, int i, int target) {
        if (numbers.length == i) {
            if (sum == target) {
                result++;
            }
            return;
        }

        DFS(numbers, sum + numbers[i], i + 1, target);
        DFS(numbers, sum - numbers[i], i + 1, target);
    }

}
