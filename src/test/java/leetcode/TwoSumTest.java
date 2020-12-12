package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TwoSumTest {

    @Test
    @DisplayName("Leet-Code : 두 수의 합 배열")
    void test() {
        int[] numbers = {3, 2, 3};
        int target = 6;

        TwoSum twoSum = new TwoSum();

        assertThat(twoSum.twoSum(numbers, target)).isEqualTo(new int[]{0, 2});
    }

}
