package programers.level1;

import java.util.Arrays;

public class Average {

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum / arr.length;
    }

    public static double getAverage2(int[] arr) {
        return Arrays.stream(arr)
                .average()
                .getAsDouble();
    }

}
