package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Virus {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int vertex = toInt(bf.readLine());
        int edge = toInt(bf.readLine());
        int start = 1;

        int[][] matrix = new int[vertex + 1][vertex + 1];

        for (int i = 0; i < edge; i++) {
            String[] input = bf.readLine().split(" ");
            int x = toInt(input[0]);
            int y = toInt(input[1]);

            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }

        int[] check = new int[matrix.length];

        int count = 0;
        count = DFS(matrix, check, start, count);
        System.out.println(count - 1);
        check = new int[matrix.length];
        int answer = 0;
        System.out.println(BFS(matrix,check,start, answer));
    }

    public static int DFS(int[][] matrix, int[] check, int start, int count) {
        check[start] = 1;
        count++;

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[start][i] == 1 && check[i] == 0) {
                count = DFS(matrix, check, i, count);
            }
        }
        return count;
    }

    public static int BFS(int[][] matrix, int[] check, int start, int answer) {
        Queue<Integer> queue = new LinkedList<>();
        check[start] = 1;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[node][i] == 1 && check[i] == 0) {
                    check[i] = i;
                    queue.add(i);
                    answer++;
                }
            }

        }
        return answer;
    }

    private static int toInt(String value) {
        return Integer.parseInt(value);
    }

}
