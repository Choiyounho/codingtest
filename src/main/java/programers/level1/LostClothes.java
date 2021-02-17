package programers.level1;

import java.util.Arrays;

public class LostClothes {

    public int solution(int n, int[] lost, int[] reserve) {
        int[] able = new int[n];

        Arrays.fill(able, 1);  // 우선 모두에게 체육복 하나씩 있다는 가정

        lostStudent(lost, able); // 체육복을 도난 당한 학생

        reserveStudent(reserve, able); // 여분을 가지고 있는 학생

        int length = able.length;

        lendClothes(able, length); // 체육복 여분이 있는 학생에게 체육복을 빌리기

        return calculate(able, length);
    }

    private void lostStudent(int[] lost, int[] able) {
        for (int j : lost) {
            able[j - 1] = 0;
        }
    }

    private void reserveStudent(int[] reserve, int[] able) {
        for (int j : reserve) {
            able[j - 1]++;
        }
    }

    private void lendClothes(int[] able, int length) {
        for (int i = 0; i < length; i++) {
            if (firstIndex(able, i)) continue;

            if (lastIndex(able, length, i)) continue;

            lostIndex(able, i);
        }
    }

    private boolean firstIndex(int[] able, int i) {
        if (i == 0) {
            if (able[0] == 0 && able[1] == 2) {
                able[0]++;
                able[1]--;
            }
            return true;
        }
        return false;
    }

    private boolean lastIndex(int[] able, int length, int i) {
        if (i == length - 1) {
            if (able[length - 1] == 0 && able[length - 2] == 2) {
                able[length - 2]--;
                able[length - 1]++;
            }
            return true;
        }
        return false;
    }

    private void lostIndex(int[] able, int i) {
        if (able[i] == 0) {
            if (isTerms(able, i)) {
                if (able[i - 1] == 2) {
                    able[i - 1]--;
                    able[i]++;
                    return;
                }

                if (able[i + 1] == 2) {
                    able[i + 1]--;
                    able[i]++;
                }
            }
        }
    }

    private boolean isTerms(int[] able, int i) {
        return able[i - 1] == 2 || able[i + 1] == 2;
    }

    private int calculate(int[] able, int length) {
        int answer = 0;
        for (int i = 0; i < length; i++) {
            if (able[i] > 0) {
                answer++;
            }
        }
        return answer;
    }

}
