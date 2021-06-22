package programers.level1;

import java.util.*;

// 모의 고사
public class TrialExam {

    public int[] solution(int[] answers) {
        int[] case1 = {1, 2, 3, 4, 5}; // 5개
        int[] case2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8개
        int[] case3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10개

        int[] score = {0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            if (case1[i % case1.length] == answers[i]) score[0]++;
            if (case2[i % case2.length] == answers[i]) score[1]++;
            if (case3[i % case3.length] == answers[i]) score[2]++;
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> list = new ArrayList<>();
        if (maxScore == score[0]) list.add(1);
        if (maxScore == score[1]) list.add(2);
        if (maxScore == score[2]) list.add(3);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
