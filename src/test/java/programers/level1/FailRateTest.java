package programers.level1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FailRateTest {

    private final FailRate failRate = new FailRate();

    @Test
    @DisplayName("Java-Level1 : 실패율")
    public void test() {
        assertThat(failRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})).isEqualTo(new int[]{3, 4, 2, 1, 5});
    }

}
