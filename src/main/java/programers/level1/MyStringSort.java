package programers.level1;

import java.util.*;

// 문자열 내 마음대로 정렬하기
public class MyStringSort {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            char c1 = o1.charAt(n);
            char c2 = o2.charAt(n);
            if (c1 > c2) {
                return 1;
            }
            if (c1 == c2) {
                return o1.compareTo(o2);
            }
            return -1;
        });

        return strings;
    }

}
