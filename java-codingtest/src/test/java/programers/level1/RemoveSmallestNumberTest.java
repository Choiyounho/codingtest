package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RemoveSmallestNumberTest {

    @Test
    @DisplayName("Java-Level1 : 가장 작은 수 제거")
    void test() {

        RemoveSmallestNumber removeSmallestNumber = new RemoveSmallestNumber();
        assertThat(removeSmallestNumber.solution(new int[]{4, 3, 2, 1})).isEqualTo(new int[]{4, 3, 2});
    }

}