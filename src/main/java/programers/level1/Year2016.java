package programers.level1;

public class Year2016 {

    static int[] lastDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public String solution(int a, int b) {
        int monthCount = sumLastDay(a, b);

        return resultDay(monthCount);
    }

    private int sumLastDay(int a, int b) {
        int sum = 0;

        for (int i = 1; i < a; i++) {
            sum += lastDays[i];
        }

        return sum + b;
    }

    private String resultDay(int monthCount) {
        if (monthCount % 7 == 1) {
            return days[5];
        }

        if (monthCount % 7 == 2) {
            return days[6];
        }

        if (monthCount % 7 == 3) {
            return days[0];
        }

        if (monthCount % 7 == 4) {
            return days[1];
        }

        if (monthCount % 7 == 5) {
            return days[2];
        }

        if (monthCount % 7 == 6) {
            return days[3];
        }
        return days[4];
    }

}
