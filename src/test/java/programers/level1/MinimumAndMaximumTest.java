package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinimumAndMaximumTest {

    private MinimumAndMaximum minimumAndMaximum = new MinimumAndMaximum();

    @Test
    @DisplayName("Java Level1 : 최소공배수와 최대공약수")
    void name() {
        assertThat(minimumAndMaximum.solution(36, 48)).isEqualTo(new int[]{12, 144});
    }
}
