package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DiscriminationSquareRootTest {

    @Test
    @DisplayName("Java-Level1 : 정수 제곱근 판별")
    void test() {
        DiscriminationSquareRoot discriminationSquareRoot = new DiscriminationSquareRoot();

        assertThat(discriminationSquareRoot.solution(121)).isEqualTo(144);
    }

}
