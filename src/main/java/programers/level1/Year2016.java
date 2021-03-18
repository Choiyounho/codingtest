package programers.level1;

public class Year2016 {

    static int[] lastDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

    public String solution(int a, int b) {
        return days[sumLastDay(a, b) % 7];
    }

    private int sumLastDay(int a, int b) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            sum += lastDays[i];
        }

        return sum + b;
    }

}
