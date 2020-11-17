package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StrangeStringTest {

    @Test
    @DisplayName("Java-Level1 : 이상한 문자 만들기")
    void test() {
        StrangeString strangeString = new StrangeString();

        assertThat(strangeString.solution("try hello world")).isEqualTo("TrY HeLlO WoRlD");
    }

}
