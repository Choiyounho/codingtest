package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DartGameTest {

    @Test
    @DisplayName("2018 KAKAO BLIND RECRUITMENT : 다트 게임")
    void dartGame() {
        DartGame dartGame = new DartGame();

        assertThat(dartGame.solution("1D2S3T*")).isEqualTo(59);
    }

}
