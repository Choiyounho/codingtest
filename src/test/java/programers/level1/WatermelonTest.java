package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {

    @Test
    @DisplayName("Java-Level1 : 수박수박수박수박수박수?")
    void printWatermelon() {
        assertThat(Watermelon.solution(3)).isEqualTo("수박수");
    }

}