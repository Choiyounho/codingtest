package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CollatzTest {

    @Test
    @DisplayName("Java-Level1 : 콜라츠 추측")
    void test() {
        Collatz collatz = new Collatz();

        assertThat(collatz.solution(6)).isEqualTo(8);
    }

}