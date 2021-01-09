package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {

    public static boolean meet(int[][] times) {
        List<Integer> list = new ArrayList<>();

        addListAndSort(times, list);

        return !result(list);
    }

    private static boolean result(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                return true;
            }
        }
        return false;
    }

    private static void addListAndSort(int[][] times, List<Integer> list) {
        for (int[] time : times) {
            for (int j = time[0]; j < time[1]; j++) {
                list.add(j);
            }
        }
        list.sort(Integer::compareTo);
    }

}
