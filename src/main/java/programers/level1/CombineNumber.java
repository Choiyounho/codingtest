package programers.level1;

import java.util.Arrays;

// K번째 수
public class CombineNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] results = new int[Math.abs(commands[i][0] - commands[i][1]) + 1];
            for (int j = 0; j < results.length; j++) {
                results[j] = array[commands[i][0] - 1 + j];
            }
            Arrays.sort(results);
            answer[i] = results[commands[i][2] - 1];
        }

        return answer;
    }

}
