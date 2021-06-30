package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CombineNumberTest {

    @Test
    @DisplayName("Java-Level1 : K번째수")
    void test() {
        CombineNumber combineNumber = new CombineNumber();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        assertThat(combineNumber.solution(array, commands)).isEqualTo(new int[]{5, 6, 3});
    }

}