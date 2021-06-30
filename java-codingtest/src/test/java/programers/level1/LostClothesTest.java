package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LostClothesTest {


    @Test
    @DisplayName("Java Level1 : 체육복")
    void test() {
        LostClothes clothes = new LostClothes();

        assertThat(clothes.solution(8, new int[]{1, 2, 4, 6}, new int[]{1, 2, 4, 6})).isEqualTo(8);
    }
}
