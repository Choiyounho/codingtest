package programers.level1;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내림차순으로 배치하기
public class ReverseOrderString {

    public String solution(String s) {
        String[] strings = s.split("");

        Arrays.sort(strings, Comparator.reverseOrder());
        StringBuilder answer = new StringBuilder();
        for (String string : strings) {
            answer.append(string);
        }
        return answer.toString();
    }

    public String solution2(String s) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);

        return new StringBuilder(new String(sol)).reverse().toString();
    }

}
