package programers.level1;

import java.util.*;

public class FailRate {

    public int[] solution(int N, int[] stages) {

        List<User> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int now = 0;
            int clear = 0;


            for (int stage : stages) {
                if (i <= stage) {
                    clear++;
                }
                if (i == stage) {
                    now++;
                }
            }

            if (clear == 0) {
                list.add(new User(i, 0));
            } else {
                list.add(new User(i, (double) now / clear));
            }
        }

        list.sort(User::compareTo);

        return list.stream().mapToInt(User::getNumber).toArray();
    }

}

class User implements Comparable<User> {

    private final int number;
    private final double failRate;

    public int getNumber() {
        return number;
    }

    public User(int number, double failRate) {
        this.number = number;
        this.failRate = failRate;
    }

    @Override
    public int compareTo(User o1) {
        if (this.failRate == o1.failRate) {
            return this.number < o1.number ? -1 : 1;
        }
        return this.failRate > o1.failRate ? -1 : 1;
    }

}

