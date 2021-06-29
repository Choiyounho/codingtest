package backjoon;

import java.util.Scanner;

public class RGB1149 {

    static int RED = 0;
    static int GREEN = 1;
    static int BLUE = 2;

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        cost = new int[count][3];
        dp = new int[count][3];

        for (int i = 0; i < count; i++) {
            cost[i][RED] = scanner.nextInt();
            cost[i][GREEN] = scanner.nextInt();
            cost[i][BLUE] = scanner.nextInt();
        }

        dp[0][RED] = cost[0][RED];
        dp[0][GREEN] = cost[0][GREEN];
        dp[0][BLUE] = cost[0][BLUE];

        System.out.println(Math.min(drawColorCost(count - 1, RED), Math.min(drawColorCost(count - 1, GREEN), drawColorCost(count - 1, BLUE))));
    }

    static int drawColorCost(int index, int color) {
        if (dp[index][color] == 0) {
            if (color == RED) {
                dp[index][RED] = Math.min(drawColorCost(index - 1, GREEN), drawColorCost(index - 1, BLUE)) + cost[index][RED];
            }
            if (color == GREEN) {
                dp[index][GREEN] = Math.min(drawColorCost(index - 1, RED), drawColorCost(index - 1, BLUE)) + cost[index][GREEN];
            }
            if (color == BLUE) {
                dp[index][BLUE] = Math.min(drawColorCost(index - 1, RED), drawColorCost(index - 1, GREEN)) + cost[index][BLUE];
            }
        }

        return dp[index][color];
    }

}
