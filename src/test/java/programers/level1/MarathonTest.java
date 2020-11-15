package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class MarathonTest {

    Marathon marathon = new Marathon();

    @Test
    @DisplayName("Java-Level1 : 완주하지 못한 선수 case1")
    void test() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "mislav", "ana"};

        assertThat(marathon.solution(participant, completion)).isEqualTo("mislav");
    }

    @Test
    @DisplayName("Java-Level1 : 완주하지 못한 선수 case1")
    void test1() {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"kiki", "eden"};

        assertThat(marathon.solution(participant1, completion1)).isEqualTo("leo");
    }

    @Test
    @DisplayName("Java-Level1 : 완주하지 못한 선수 case1")
    void test2() {
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"marina", "josipa", "nikola", "filipa"};
        assertThat(marathon.solution(participant2, completion2)).isEqualTo("vinko");
    }

    @Test
    @DisplayName("Java-Level1 : 완주하지 못한 선수 case2")
    void test3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "mislav", "ana"};

        assertThat(marathon.solution2(participant, completion)).isEqualTo("mislav");
    }

    @Test
    @DisplayName("Java-Level1 : 완주하지 못한 선수 case2")
    void test4() {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"kiki", "eden"};

        assertThat(marathon.solution2(participant1, completion1)).isEqualTo("leo");
    }

    @Test
    @DisplayName("Java-Level1 : 완주하지 못한 선수 case2")
    void test5() {
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"marina", "josipa", "nikola", "filipa"};
        assertThat(marathon.solution2(participant2, completion2)).isEqualTo("vinko");
    }

}