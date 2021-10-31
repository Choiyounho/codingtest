package programers.level2;

import java.util.*;

public class LifeBoat {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{100, 500, 500, 900, 950}, 1000));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        Deque<Integer> queue = new LinkedList<>();

        for (int person : people) {
            queue.add(person);
        }

        while (!queue.isEmpty()) {
            int weight = queue.pollLast();
            answer++;

            if (queue.isEmpty()) {
                break;
            }

            if (weight + queue.getFirst() <= limit) {
                queue.pollFirst();
            }
        }
        return answer;
    }

}
