package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class BetweenSumTest {

    @Test
    @DisplayName("Java-Level1 : 두 정수 사이의 합")
    void test() {
        BetweenSum betweenSum = new BetweenSum();

        int a = 3;
        int b = 5;

        assertThat(betweenSum.solution(3, 5)).isEqualTo(12);
    }

}