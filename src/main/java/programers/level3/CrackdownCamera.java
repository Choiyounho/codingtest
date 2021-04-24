package programers.level3;

import java.util.Arrays;
import java.util.Comparator;

public class CrackdownCamera {

    public int solution(int[][] routes) {
        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));

        int answer = 0;

        int cameraPosition = -30001;

        for(int[] route : routes) {
            if(cameraPosition < route[0]) {
                cameraPosition = route[1];
                answer++;
            }
        }

        return answer;
    }

}
