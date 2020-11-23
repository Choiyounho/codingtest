package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class PlusDigitTest {

    @Test
    @DisplayName("Java-Level1 : 자릿 수 더하기")
    void test() {
        PlusDigit plusDigit = new PlusDigit();

        assertThat(plusDigit.solution(123)).isEqualTo(6);
    }

    @Test
    @DisplayName("Java-Level1 : 자릿 수 더하기 2")
    void test2() {
        PlusDigit plusDigit = new PlusDigit();

        assertThat(plusDigit.solution2(123)).isEqualTo(6);
    }

}