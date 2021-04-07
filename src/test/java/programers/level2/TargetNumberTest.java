package programers.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TargetNumberTest {

    private final TargetNumber targetNumber = new TargetNumber();

    @Test
    @DisplayName("Java-Level2 : 타겟 넘버")
    void test() {
        assertThat(targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(5);
    }

}
