package programers.level1;

import java.util.HashMap;
import java.util.Map;

// 2020 카카오 인턴십 키패드 누르기
public class Keypad {

    public String solution(int[] numbers, String hand) {

        String myHand = String.valueOf(hand.charAt(0)).toUpperCase();

        int[][] keypad = { // 대각선 거리 고려 루트2를 2로 치환
                {0, 3}, {1, 3}, {2, 3},
                {0, 2}, {1, 2}, {2, 2},
                {0, 1}, {1, 1}, {2, 1},
                {0, 0}, {1, 0}, {2, 0}
        };

        int[] leftLocation = keypad[9];
        int[] rightLocation = keypad[11];

        Map<Integer, int[]> map = new HashMap<>();

        initMap(map);

        StringBuilder answer = new StringBuilder();
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                leftLocation = map.get(number);
                answer.append("L");
                continue;
            }

            if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightLocation = map.get(number);
                continue;
            }

            double leftHandDistance = distance(map.get(number), leftLocation);
            double rightHandDistance = distance(map.get(number), rightLocation);

            if (leftHandDistance == rightHandDistance) {
                if (myHand.equals("L")) {
                    leftLocation = map.get(number);
                    answer.append("L");
                } else {
                    rightLocation = map.get(number);
                    answer.append("R");
                }
                continue;
            }

            if (leftHandDistance < rightHandDistance) {
                leftLocation = map.get(number);
                answer.append("L");
                continue;
            }

            if (leftHandDistance > rightHandDistance) {
                rightLocation = map.get(number);
                answer.append("R");
            }

        }

        return answer.toString();
    }

    private void initMap(Map<Integer, int[]> map) {
        map.put(1, new int[]{0, 3});
        map.put(2, new int[]{1, 3});
        map.put(3, new int[]{2, 3});
        map.put(4, new int[]{0, 2});
        map.put(5, new int[]{1, 2});
        map.put(6, new int[]{2, 2});
        map.put(7, new int[]{0, 1});
        map.put(8, new int[]{1, 1});
        map.put(9, new int[]{2, 1});
        map.put(0, new int[]{1, 0});
    }

    private double distance(int[] arr1, int[] arr2) {
        double answer = Math.sqrt(Math.pow((arr2[1] - arr1[1]), 2) + Math.pow((arr2[0] - arr1[0]), 2));
        if (answer == Math.sqrt(2)) {
            return 2;
        }
        if (answer == Math.sqrt(5)) {
            return 3;
        }
        if (answer == Math.sqrt(10)) {
            return 4;
        }
        return answer;
    }

}
