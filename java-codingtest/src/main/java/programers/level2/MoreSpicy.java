package programers.level2;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
        }

        while (priorityQueue.size() > 1 && priorityQueue.peek() < K) {
            int foodScoville = priorityQueue.poll();
            int foodScoville2 = priorityQueue.poll();

            int mixScoville = mix(foodScoville, foodScoville2);
            answer++;
            priorityQueue.add(mixScoville);
        }

        if (priorityQueue.size() <= 1 && priorityQueue.peek() < K) {
            return -1;
        }

        return answer;
    }

    public int mix(int a, int b) {
        return (a + (b * 2));
    }

}
