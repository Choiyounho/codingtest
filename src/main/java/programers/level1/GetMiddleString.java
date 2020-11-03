package programers.level1;

public class GetMiddleString {

    public static String getMiddleString(String input) {
        StringBuilder mid = new StringBuilder();
        if (input.length() % 2 != 0) {
            return mid.append(input.charAt(input.length() / 2)).toString();
        }
        return mid.append(input.charAt(input.length() / 2 - 1))
                .append(input.charAt(input.length() / 2)).toString();
    }

    public static String getMiddleString2(String input) {
        int length = input.length();
        int number = length % 2;
        int division = length / 2;
        if (number == 1) {
            return String.valueOf(input.charAt(division));
        }
        return input.substring(division - 1, division + 1);
    }

}

