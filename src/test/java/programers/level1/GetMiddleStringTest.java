package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GetMiddleStringTest {

    @Test
    @DisplayName("Java-Level1 : 가운데 글자 추출")
    void getMiddleStringTest() {
        assertThat(GetMiddleString.getMiddleString("안녕하세요")).isEqualTo("하");

    }
    @Test
    @DisplayName("Java-Level1 : 가운데 글자 추출")
    void getMiddleStringTest2() {
        assertThat(GetMiddleString.getMiddleString2("안녕하세요")).isEqualTo("하");

    }

}