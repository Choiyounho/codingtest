package programers.level2;

import java.util.*;

public class FunctionDevelopment {

    int day = 0;
    int index = 0;

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            q.offer(progresses[i]);
        }

        int peekNum = 0;
        
        while (!q.isEmpty()) {
            int count = 0;

            peekNum = q.peek() + ((speeds[index] * day));

            if (peekNum < 100) {
                for (int i = 0; peekNum < 100; i++) {
                    peekNum += speeds[index];
                    day++;
                }
            }

            q.poll();
            count++;
            index++;
            try {
                while (q.peek() + (speeds[index] * day) >= 100) {
                    q.poll();
                    count++;
                    index++;
                }
            } catch (Exception e) {
                list.add(count);
                break;
            }

            list.add(count);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
