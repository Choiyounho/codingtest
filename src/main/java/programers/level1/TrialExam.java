package programers.level1;

// 모의 고사
public class TrialExam {

    public int[] solution(int[] answers) {
        int[] mathLoser1 = {1, 2, 3, 4, 5};
        int[] mathLoser2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] mathLoser3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] loserPoint = new int[3];

        int loser1Circle = getLoserCircle(answers.length, mathLoser1.length);
        loserPoint[0] = getLoserPoint(answers, mathLoser1, loserPoint[0], loser1Circle, 5);

        int loser2Circle = getLoserCircle(answers.length, mathLoser2.length);
        loserPoint[1] = getLoserPoint(answers, mathLoser2, loserPoint[1], loser2Circle, 8);

        int loser3Circle = getLoserCircle(answers.length, mathLoser3.length);
        loserPoint[2] = getLoserPoint(answers, mathLoser3, loserPoint[2], loser3Circle, 10);

        if (loserPoint[0] == loserPoint[1] && loserPoint[1] == loserPoint[2]) return new int[]{1, 2, 3};

        if (loserPoint[0] == loserPoint[1] && loserPoint[0] > loserPoint[2]) return new int[]{1, 2};

        if (loserPoint[1] == loserPoint[2] && loserPoint[1] > loserPoint[0]) return new int[]{2, 3};

        if (loserPoint[0] == loserPoint[2] && loserPoint[0] > loserPoint[1]) return new int[]{1, 3};

        if (loserPoint[0] > loserPoint[1] && loserPoint[0] > loserPoint[2]) return new int[]{1};

        if (loserPoint[1] > loserPoint[0] && loserPoint[1] > loserPoint[2]) return new int[]{2};

        return new int[]{3};
    }

    private int getLoserCircle(int length, int length2) {
        return length % length2;
    }

    private int getLoserPoint(int[] answers, int[] mathLoser, int loserPoint, int loserCircle, int pattern) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == mathLoser[getLoserCircle(answers.length + i - loserCircle, pattern)]) {
                loserPoint++;
            }
        }
        return loserPoint;
    }

}
