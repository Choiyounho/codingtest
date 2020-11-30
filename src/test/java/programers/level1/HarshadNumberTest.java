package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class HarshadNumberTest {

    @Test
    @DisplayName("Java-Level1 : 하샤드 수")
    void test() {
        HarshadNumber harshadNumber = new HarshadNumber();

        assertThat(harshadNumber.solution(10)).isTrue();
    }
}
