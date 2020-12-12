package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CoverNumberTest {

    @Test
    @DisplayName("핸드폰 번호 가리기")
    void coverNumber() {
        CoverNumber coverNumber = new CoverNumber();

        assertThat(coverNumber.solution("01012345678")).isEqualTo("*******5678");
    }

}
