package programers.level3;

public class TriangleNumber {

    public int solution(int[][] triangle) {

        int num = 0;

        for (int i = triangle.length - 1; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length - 1; j++) {
                num = Math.max(triangle[i][j], triangle[i][j + 1]);
                triangle[i - 1][j] += num;
            }
        }

        return triangle[0][0];
    }
}
