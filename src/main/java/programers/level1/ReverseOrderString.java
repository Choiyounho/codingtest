package programers.level1;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내림차순으로 배치하기
public class ReverseOrderString {

    public String solution(String s) {
        String[] strings = s.split("");

        Arrays.sort(strings, Comparator.reverseOrder());
        String answer = "";
        for (int i = 0; i < strings.length; i++) {
            answer += strings[i];
        }
        return answer;
    }

    public String solution2(String s) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);

        return new StringBuilder(new String(sol)).reverse().toString();
    }

}
