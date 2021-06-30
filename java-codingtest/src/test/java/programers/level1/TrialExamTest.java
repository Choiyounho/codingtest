package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TrialExamTest {

    private TrialExam trialExam = new TrialExam();
    private int[] answer = {1, 2, 3, 4, 5};

    @Test
    @DisplayName("Java-Level1 : 모의고사")
    void solution() {
        assertThat(trialExam.solution(answer)).isEqualTo(new int[]{1});
    }
}
