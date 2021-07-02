package programers.level2;

import java.util.*;

public class GameMapShortestDistance {

    static int[][] direct = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static boolean[][] visited;
    static int x, y;

    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps.length];
        x = maps.length;
        y = maps[0].length;

        return bfs(new int[]{0, 0}, maps);
    }

    private int bfs(int[] start, int[][] maps) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(start[0], start[1], 1));
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();
            if (p.x == x - 1 && p.y == y - 1) return p.count;

            for (int i = 0; i < 4; i++) {
                int dx = p.x + direct[i][0];
                int dy = p.y + direct[i][1];

                if (!isFail(dy, dx) && !visited[dx][dy] && maps[dx][dy] == 1) {
                    visited[dx][dy] = true;
                    q.offer(new Point(dx, dy, p.count + 1));
                }
            }
        }

        return -1;
    }

    boolean isFail(int dx, int dy) {
        return dx < 0 || dx >= x || dy < 0 || dy >= y;
    }
}

class Point {
    int x, y, count;

    Point(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
}
