package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindKimTest {

    @Test
    @DisplayName("Java-Level1 : 서울에서 김서방 찾기")
    void solutionTest() {
        FindKim findKim = new FindKim();

        assertThat(findKim.solution(new String[]{"Jane", "Kim"})).isEqualTo("김서방은 1에 있다");
    }

}
