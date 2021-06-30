package programers.level1;

public class StringHandling {

    public static boolean onlyLetter(String input) {

        if (input.length() == 4 || input.length() == 6) {
            if (isNumeric(input)) {
                return true;
            }
            for (int i = 0; i < 9; i++) {
                if (input.contains(String.valueOf(i))) {
                    return false;
                }
            }
        }
        return false;
    }

    private static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
