package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AverageTest {

    @Test
    @DisplayName("Java-Level1 : 평균구하기")
    void getAverageTest() {
        assertThat(Average.getAverage(new int[]{1, 2, 3, 4})).isEqualTo(2.5);
    }

    @Test
    @DisplayName("Java-Level1 : 평균구하기2")
    void getAverageTest2() {
        assertThat(Average.getAverage2(new int[]{1, 2, 3, 4})).isEqualTo(2.5);
    }



}