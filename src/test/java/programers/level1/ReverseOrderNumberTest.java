package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ReverseOrderNumberTest {

    @Test
    @DisplayName("Java-Level1 : 정수 내림차순으로 배치하기")
    void test() {
        ReverseOrderNumber reverseOrderNumber = new ReverseOrderNumber();

        assertThat(reverseOrderNumber.solution(118372)).isEqualTo(873211);
    }

}
