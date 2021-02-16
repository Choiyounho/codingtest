package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumDivisorNumberTest {

    private SumDivisorNumber sumDivisorNumber = new SumDivisorNumber();

    @Test
    @DisplayName("Java Level1 : 약수의 합")
    void test() {
        assertThat(sumDivisorNumber.solution(12)).isEqualTo(28);
    }
}
