package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArithmeticProgressionTest {

    @Test
    @DisplayName("Java-Level1 : x만큼 간격이 있는 n개의 숫자")
    void test() {
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression();

        assertThat(arithmeticProgression.solution(2, 5)).isEqualTo(new long[]{2,4,6,8,10});
    }
}