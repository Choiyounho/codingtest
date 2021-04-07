package programers.level2;

import java.util.*;

public class Camouflage {

    public int solution(String[][] clothes) {
        Map<String, Integer> map = initMap(clothes);

        return getResult(map);
    }

    private Map<String, Integer> initMap(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) { // 이미 key 가 있다면 Value 를 1 더함        이름, 종류
            if (map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
                continue;
            }
            map.put(clothes[i][1], 1);
        }

        return map;
    }

    private int getResult(Map<String, Integer> map) {
        int result = 1;

        Set<String> set = map.keySet();

        for (String key : set) {
            result *= map.get(key) + 1;
        }

        return result - 1;
    }

}
