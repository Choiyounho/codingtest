package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KeypadTest {

    private Keypad keypad = new Keypad();

    @Test
    @DisplayName("2020 카카오 인턴십 : 키패드 누르기")
    void test() {
        assertThat(keypad.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right")).isEqualTo("LRLLLRLLRRL");
    }

}
