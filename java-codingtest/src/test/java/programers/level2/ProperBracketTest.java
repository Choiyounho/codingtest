package programers.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ProperBracketTest {

    private ProperBracket properBracket = new ProperBracket();

    @Test
    @DisplayName("Java-Level2 : 올바른 괄호")
    void test() {
        assertThat(properBracket.solution("()()")).isTrue();
    }
}
