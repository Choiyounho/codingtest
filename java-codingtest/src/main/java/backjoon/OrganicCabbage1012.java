package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class OrganicCabbage1012 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");

        int number = toInt(input[0]);

        for (int k = 0; k < number; k++) {
            input = bf.readLine().split(" ");
            int x = toInt(input[0]);
            int y = toInt(input[1]);
            int cycle = toInt(input[2]);

            int[][] matrix = new int[x][y];
            for (int i = 0; i < cycle; i++) {
                input = bf.readLine().split(" ");
                matrix[toInt(input[0])][toInt(input[1])] = 1;
            }

            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 1) {
                        count++;
                        dfs(matrix, i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void dfs(int[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length ||
                y < 0 || y >= matrix[0].length ||
                matrix[x][y] != 1) {
            return;
        }

        matrix[x][y] = 0;
        dfs(matrix, x - 1, y);
        dfs(matrix, x + 1, y);
        dfs(matrix, x, y - 1);
        dfs(matrix, x, y + 1);
    }

    private static void bfs(int[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length ||
                y < 0 || y >= matrix[0].length ||
                matrix[x][y] != 1) {
            return;
        }

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y});
    }

    private static int toInt(String input) {
        return Integer.parseInt(input);
    }

}
