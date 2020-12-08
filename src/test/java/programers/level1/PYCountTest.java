package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PYCountTest {

    @Test
    @DisplayName("Java-Level1 : 문자열 내 p와 y의 개수")
    void test() {
        PYCount pyCount = new PYCount();

        assertThat(pyCount.solution("psy")).isTrue();
    }

}