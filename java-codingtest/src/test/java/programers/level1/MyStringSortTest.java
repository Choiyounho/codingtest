package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MyStringSortTest {

    @Test
    @DisplayName("Java-Level1 : 문자열 내 마음대로 정렬하기")
    void test() {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        MyStringSort myStringSort = new MyStringSort();

        assertThat(myStringSort.solution(strings, n)).isEqualTo(new String[]{"car", "bed", "sun"});
    }

}
