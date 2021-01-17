package codility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CyclicRotationTest {

    private CyclicRotation cyclicRotation = new CyclicRotation();
    private int[] numbers = {3, 8, 9, 7, 6};
    private int rotation = 3;

    @Test
    @DisplayName("Java-Codility : CyclicRotation - 100%")
    void solution() {
        assertThat(cyclicRotation.solution(numbers, rotation)).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }

    @Test
    @DisplayName("Java-Codility : CyclicRotation - 100%, 매우 비효율적인 코드")
    void solution1() {
        assertThat(cyclicRotation.solution1(numbers, rotation)).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }
}
