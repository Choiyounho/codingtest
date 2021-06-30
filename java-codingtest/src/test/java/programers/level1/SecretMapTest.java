package programers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SecretMapTest {

    private final SecretMap secretMap = new SecretMap();

    @Test
    @DisplayName("Java-Level1 : 비밀지도")
    void test() {
        assertThat(secretMap.solution(6, new int[]{46, 33, 33, 22, 21, 50}, new int[]{27 ,56, 19, 14, 14, 10}))
                .isEqualTo(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "});
    }
}
