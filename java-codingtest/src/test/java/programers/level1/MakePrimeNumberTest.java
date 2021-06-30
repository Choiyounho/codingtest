package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MakePrimeNumberTest {

    private MakePrimeNumber makePrimeNumber = new MakePrimeNumber();

    @Test
    @DisplayName("Java-Level1 : 소수만들기")
    void test() {
        assertThat(makePrimeNumber.solution(new int[]{1, 2, 3, 4})).isEqualTo(1);
    }
}
