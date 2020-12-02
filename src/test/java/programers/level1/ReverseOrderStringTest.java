package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseOrderStringTest {

    @Test
    @DisplayName("Java-Level1 : 문자열 내림차순으로 배치하기")
    void test() {
        ReverseOrderString reverseOrderString = new ReverseOrderString();

        String s = "Zbcdefg";

        assertThat(reverseOrderString.solution2(s)).isEqualTo("gfedcbZ");
    }

}
