package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CaesarCipherTest {

    @Test
    @DisplayName("Java - Level1 : 시저 암호")
    void test() {
        CaesarCipher caesarCipher = new CaesarCipher();

        assertThat(caesarCipher.solution("AB", 1)).isEqualTo("BC");
    }

}