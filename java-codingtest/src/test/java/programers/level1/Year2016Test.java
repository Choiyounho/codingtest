package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Year2016Test {

    private final Year2016 year2016 = new Year2016();

    @Test
    @DisplayName("Java-Level1 : 2016년")
    void test() {
        assertThat(year2016.solution(2, 29)).isEqualTo("MON");
    }

}
