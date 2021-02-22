package programers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DotProductTest {

    private DotProduct dotProduct = new DotProduct();

    @Test
    void test() {
        assertThat(dotProduct.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2})).isEqualTo(3);
    }
}
