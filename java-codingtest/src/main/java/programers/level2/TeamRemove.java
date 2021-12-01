package programers.level2;

import java.util.Stack;

public class TeamRemove {

    public int solution(String s) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (s.charAt(i) == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        return stack.isEmpty() ? 1 : answer;
    }

}
