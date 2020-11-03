package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringHandlingTest {

    @Test
    @DisplayName("Java-Level1 : 문자열 다루기 기본")
    void onlyHandleTest() {
        assertThat(StringHandling.onlyLetter("8234")).isTrue();
    }
}