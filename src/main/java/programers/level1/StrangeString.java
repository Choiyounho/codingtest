package programers.level1;

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
                if (count % 2 == 0) {
                    strings[i] = strings[i].toUpperCase();
                    count++;
                } else {
                    strings[i] = strings[i].toLowerCase();
                    count++;
                }
            }
            answer += strings[i];
        }

        return answer;
    }

}
