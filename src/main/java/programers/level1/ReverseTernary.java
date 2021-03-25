package programers.level1;

import java.util.ArrayList;
import java.util.List;

public class ReverseTernary {

    public int solution(int n) {
        List<Integer> ternaryList = new ArrayList<>();

        extractedList(n, ternaryList);

        return getResult(ternaryList);
    }

    private void extractedList(int n, List<Integer> ternaryList) {
        while (n > 0) {
            ternaryList.add(n % 3);
            n = n / 3;
        }
    }

    private int getResult(List<Integer> ternaryList) {
        int result = 0;

        for (int i = 0; i < ternaryList.size(); i++) {
            result += ternaryList.get(ternaryList.size() - 1 - i) * Math.pow(3, i);
        }
        return result;
    }

}
