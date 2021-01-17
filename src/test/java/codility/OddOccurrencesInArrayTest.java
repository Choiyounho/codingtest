package codility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
    private int[] numbers = {9, 3, 9, 3, 9, 7, 3, 9, 3};

    @Test
    @DisplayName("Java-Codility : OddOccurrencesInArray - 100%")
    void solution() {
        assertThat(oddOccurrencesInArray.solution(numbers)).isEqualTo(7);
    }

    @Test
    @DisplayName("Java-Codility : OddOccurrencesInArray - 54%, TIME OUT")
    void solution1() {
        assertThat(oddOccurrencesInArray.solution1(numbers)).isEqualTo(7);
    }
}
