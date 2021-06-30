package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivisibleTest {

    @Test
    @DisplayName("Java-Level1 : 나누어 떨어지는 숫자 배열")
    void test() {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        Divisible divisorNumberArray = new Divisible();

        assertThat(divisorNumberArray.solution(arr, divisor)).isEqualTo(new int[]{5, 10});
    }

}