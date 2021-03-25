package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseTernaryTest {

    private final ReverseTernary reverseTernary = new ReverseTernary();

    @Test
    @DisplayName("Java-Level1 : 3진법 뒤집기")
    void test() {
        assertThat(reverseTernary.solution(45)).isEqualTo(7);
    }

}
