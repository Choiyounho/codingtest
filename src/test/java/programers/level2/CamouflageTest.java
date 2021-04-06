package programers.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CamouflageTest {

    private final Camouflage camouflage = new Camouflage();

    @Test
    @DisplayName("Java-Level2 : 위장")
    void test() {
        assertThat(camouflage.solution(new String[][]{
                        {"yellowhat", "face"}, {"green_turban", "face"},
                        {"yellowhat1", "s"}, {"bluesunglasses1", "ㅁ"}, {"green_turban1", "ㅇ"}})).isEqualTo(23);
    }

}
