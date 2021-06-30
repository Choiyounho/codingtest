package programers.level1;

public class ReverseNum {

    public int[] solution(long n) {

        String[] num = String.valueOf(n).split("");

        int[] answer = new int[num.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(num[num.length - 1 - i]);
        }

        return answer;
    }

}
