package programers.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneKetmonTest {

    private PhoneKetmon phoneKetmon = new PhoneKetmon();

    @Test
    @DisplayName("Java level2 : 폰켓몬")
    void test() {
        assertThat(phoneKetmon.solution(new int[]{3,1,2,3})).isEqualTo(3);
    }
}
