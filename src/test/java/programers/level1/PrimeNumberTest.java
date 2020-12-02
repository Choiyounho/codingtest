package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    @DisplayName("Java-Level1 : 소수 찾기")
    void test() {
        PrimeNumber primeNumber = new PrimeNumber();

        assertThat(primeNumber.solution(5)).isEqualTo(3);
    }

}
