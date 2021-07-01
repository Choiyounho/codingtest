package programers.level3;

import java.util.*;

public class Network {

    public int solution(int n, int[][] computers) {
        toZeroForMe(computers);

        int answer = checkSolo(computers);

        return getAnswer(computers, answer);
    }

    private void toZeroForMe(int[][] isConnected) {
        for (int i = 0; i < isConnected.length; i++) {
            isConnected[i][i] = 0;
        }
    }

    private int checkSolo(int[][] isConnected) {
        int answer = 0;

        boolean isZero = true;

        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero) {
                answer++;
                continue;
            }
            isZero = true;
        }
        return answer;
    }

    private int getAnswer(int[][] isConnected, int answer) {
        boolean isCheck = false;
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] != 0) {
                    isCheck = true;
                    dfs(isConnected, i, j);
                }
            }
            if (isCheck) {
                answer++;
                isCheck = false;
            }
        }
        return answer;
    }

    private void dfs(int[][] isConnected, int i, int j) {
        isConnected[i][j] = 0;
        isConnected[j][i] = 0;

        for (int k = 0; k < isConnected[0].length; k++) {
            if (isConnected[j][k] != 0) {
                dfs(isConnected, j, k);
            }
        }
    }
}

