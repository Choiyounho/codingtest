package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CraneTest {

    @Test
    @DisplayName("2019 카카오 개발자 겨울 인턴십 : 크레인 인형뽑기 게임")
    void craneTest() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        Crane crane = new Crane();

        assertThat(crane.solution(board, moves)).isEqualTo(4);
    }

}
