package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SumElementsTest {

    @Test
    @DisplayName("Java-Level1 : 두개 뽑아서 더하기")
    void solution() {

        assertThat(SumElements.solution(new int[]{2, 1, 3, 4, 1}))
                .isEqualTo(new int[]{2, 3, 4, 5, 6, 7});

    }

}