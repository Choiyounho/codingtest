package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class DFSAndBfS1260 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");
        int vertex = toInt(input[0]); // node
        int edge = toInt(input[1]);
        int start = toInt(input[2]); // startNode


        int[][] matrix = new int[vertex + 1][vertex + 1];

        for (int i = 0; i < edge; i++) {
            input = bf.readLine().split(" ");
            int x = toInt(input[0]);
            int y = toInt(input[1]);

            matrix[x][y] = 1; // matrix[x][y] = matrix[y][x] = 1;
            matrix[y][x] = 1;
        }

        int[] check = new int[matrix[0].length]; // boolean[] visited = new boolean[node + 1];
        DFS(matrix, check, start);

        System.out.println();
        check = new int[matrix[0].length];

        BFS(matrix, check, start);
    }


    public static void DFS(int[][] matrix, int[] check, int start) {
        System.out.print(start + " ");
        check[start] = 1;

        for (int i = 1; i < matrix[0].length; i++) { // matrix.length 5 x 5
            if (matrix[start][i] == 1 && check[i] == 0) { // !visited[i]
                DFS(matrix, check, i);
            }
        }
    }


    public static void BFS(int[][] matrix, int[] check, int start) {
        Queue<Integer> queue = new LinkedList<>();
        check[start] = 1; // {0, 0, 0, 0, 0}
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[node][i] == 1 && check[i] == 0) {
                    check[i] = i;
                    queue.add(i);
                }
            }

        }
    }

    private static int toInt(String value) {
        return Integer.parseInt(value);
    }
}
