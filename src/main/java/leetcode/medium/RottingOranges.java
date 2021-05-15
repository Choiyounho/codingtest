package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RottingOranges {

    public static void main(String[] args) {
        RottingOranges rottingOranges = new RottingOranges();

        System.out.println(rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }

    public int orangesRotting(int[][] grid) {

        int freshOrange = 0;
        Stack<int[]> queue = new Stack<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.push(new int[]{i, j}); // 썩은 오렌지의 위치
                }
                if (grid[i][j] == 1) { // 신선한 오렌지 개수
                    freshOrange++;
                }
            }
        }

        if (freshOrange == 0 ) {
            return 0;
        }

        int answer = 0;  //q가 비고, 신선한 오렌지가 0일 때
        while (!queue.isEmpty() && freshOrange > 0) { // 썩힐 오렌지가 더 이상 없을 때
            answer++;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] rottingDirect = queue.pop(); // q는 poll Stack pop
                                                   // 큐를 쓰는 이유 :
                int[][] direct = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
                for (int j = 0; j < direct.length; j++) {
                    int x = rottingDirect[0] + direct[j][0];
                    int y = rottingDirect[1] + direct[j][1];

                    if (x < 0 || x >= grid.length ||
                            y < 0 || y >= grid[0].length ||
                            grid[x][y] != 1) {
                        continue;
                    }
                    // 전파 받은 위치 큐에 넣음
                    queue.push(new int[]{x, y});
                    grid[x][y] = 2;
                    freshOrange--;
                }
            }
        }

        return freshOrange == 0 ? answer : -1;
    }

}
