package programers.level2;

// 올바른 괄호
public class ProperBracket {

    boolean solution(String s) {
        // )로 시작한 경우
        if (s.charAt(0) == ')') {
            return false;
        }

        // 마지막 값이 )가 아닌 경우
        if (s.charAt(s.length() - 1) != ')') {
            return false;
        }

        // 길이가 홀수인 경우
        if (s.length() % 2 != 0) {
            return false;
        }

        // ( 의 개수가 전체의 절반이 아닌 경우
        int openBracket = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openBracket++;
            }
        }

        if (s.length() / 2 != openBracket) {
            return false;
        }

        // (개수 보다 ) 개수가 초과될 때가 있을 경우
        openBracket = 0;
        int closeBracket = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openBracket++;
            } else {
                closeBracket++;
            }
            if (openBracket < closeBracket) {
                return false;
            }
        }

        return true;
    }

}
