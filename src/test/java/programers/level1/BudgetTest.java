package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BudgetTest {

    private Budget budget = new Budget();

    @Test
    @DisplayName("Java-Level1 : 예산")
    void test() {
        assertThat(budget.solution(new int[]{1, 3, 2, 5, 4}, 9)).isEqualTo(3);
    }
}
