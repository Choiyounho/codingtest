package programers.level1;

import java.util.ArrayList;
import java.util.List;

public class StrangeString {

    public String solution(String s) {
        String[] strings = s.split("");
        String answer = "";
        String space = " ";
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(space)) {
                count = 0;
            }else {
                count = toUpdateCase(strings, count, i);
            }
            answer += strings[i];
        }

        return answer;
    }

    private int toUpdateCase(String[] strings, int count, int i) {
        if (count % 2 == 0) {
            strings[i] = strings[i].toUpperCase();
            count++;
        } else {
            strings[i] = strings[i].toLowerCase();
            count++;
        }
        return count;
    }
//

    public String solution2(String input) {
        int noneSpace = 0;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            String character = input.substring(i, i + 1);
            noneSpace = parseCharacter(noneSpace, result, character);
        }

        return result.toString();
    }

    private int parseCharacter(int noneSpace, StringBuffer result, String character) {
        if (character.equals(" ")) {
            result.append(character);
            return 0;
        }
        if (!character.isEmpty()) {
            result.append(toUpdateCase(noneSpace, character));
            noneSpace++;
        }
        return noneSpace;
    }

    private String toUpdateCase(int noneSpace, String character) {
        if (noneSpace % 2 == 0) {
            return character.toUpperCase();
        }
        return character.toLowerCase();
    }

}
