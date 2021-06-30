package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixSumTest {

    @Test
    @DisplayName("Java-Level1 : 행렬의 덧셈")
    void test() {
        MatrixSum matrixSum = new MatrixSum();

        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        assertThat(matrixSum.solution(arr1, arr2)).isEqualTo(new int[][]{{4, 6}, {7, 9}});
    }

}
