package leetcode.medium;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        // 자기 자신을 0으로 만든다.
        toZeroForMe(isConnected);

        int answer = checkSolo(isConnected);

        // 이어진 링크들 다 0으로 만들기
        answer = getAnswer(isConnected, answer);

        return answer;
    }

    private void toZeroForMe(int[][] isConnected) {
        for (int i = 0; i < isConnected.length; i++) {
            isConnected[i][i] = 0;
        }
    }

    private int checkSolo(int[][] isConnected) {
        int answer = 0;

        boolean isZero = true;
        // 모든 값이 0이면 answer++
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] != 0) { // 0이 아닐때 isZero 변경
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
