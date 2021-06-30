package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class EvenAndOddTest {

    @Test
    @DisplayName("Java-Level1 : 짝수와 홀수")
    void solutionTest() {
        EvenAndOdd evenAndOdd = new EvenAndOdd();

        assertThat(evenAndOdd.solution(3)).isEqualTo("Odd");
    }

}