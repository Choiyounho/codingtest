package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ReverseNumTest {

    ReverseNum reverseNum = new ReverseNum();

    @Test
    @DisplayName("Java-Level1 : 자연수 뒤집어 배열로 만들기")
    void test() {
        assertThat(reverseNum.solution(12345L)).isEqualTo(new int[]{5, 4, 3, 2, 1});
    }
    
}
