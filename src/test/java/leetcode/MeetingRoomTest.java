package leetcode;

import leetcode.easy.MeetingRoom;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MeetingRoomTest {

    int[][] times;

    @Test
    @DisplayName("미팅룸 회의시간 배정 case1")
    void meetingRoom() {
        times = new int[][]{{0, 30}, {5, 15}, {7, 10}};

        assertThat(MeetingRoom.meet(times)).isFalse();
    }

    @Test
    @DisplayName("미팅룸 회의시간 배정 case2")
    void meetingRoom1() {
        times = new int[][]{{1, 4}, {5, 7}, {8, 10}};

        assertThat(MeetingRoom.meet(times)).isTrue();
    }

}
