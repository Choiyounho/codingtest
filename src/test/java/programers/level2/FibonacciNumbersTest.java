package programers.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FibonacciNumbersTest {

    private FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();

    @Test
    @DisplayName("Java-Level2 : 피보나치 수")
    void test() {
        assertThat(fibonacciNumbers.solution(5)).isEqualTo(5);
    }
}
