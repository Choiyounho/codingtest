package programers.level1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SameNumTest {

    int[] arr = {1, 1, 3, 3, 0, 1, 1};
    int[] arr1 = {4, 4, 4, 3, 3};

    @Test
    @DisplayName("Java-Level1 : 같은 숫자는 싫어")
    void test() {
        SameNum sameNum = new SameNum();

        assertThat(sameNum.solution(arr)).isEqualTo(new int[]{1, 3, 0, 1});
    }

    @Test
    @DisplayName("Java-Level1 : 같은 숫자는 싫어")
    void test1() {
        SameNum sameNum = new SameNum();

        assertThat(sameNum.solution(arr1)).isEqualTo(new int[]{4, 3});
    }

}