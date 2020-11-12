package programers.level1;

import java.util.ArrayList;
import java.util.List;

public class Crane {

    public int solution(int[][] board, int[] moves) {
        List<Integer> bucket = new ArrayList<>();

        int boom = 0;

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (bucket.isEmpty()) {
                        bucket.add(board[j][moves[i] - 1]);
                        board[j][moves[i] - 1] = 0;
                        break;
                    }
                    if (bucket.get(bucket.size() - 1) != board[j][moves[i] - 1]) {
                        bucket.add(board[j][moves[i] - 1]);
                        board[j][moves[i] - 1] = 0;
                    }
                    if (bucket.get(bucket.size() - 1) == board[j][moves[i] - 1]) {
                        bucket.remove(bucket.size() - 1);
                        board[j][moves[i] - 1] = 0;
                        boom += 2;
                    }
                    break;
                }
            }
        }
        return boom;
    }

}
