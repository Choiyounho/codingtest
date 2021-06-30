package programers.level3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CrackdownCameraTest {

    private final CrackdownCamera crackdownCamera = new CrackdownCamera();

    @Test
    @DisplayName("Java-Level3 : 단속 카메라")
    void test() {
        assertThat(crackdownCamera.solution(new int[][]{{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}})).isEqualTo(2);
    }
}
