package programers.level1;

/*
콜라츠 추측 입력된 수가 짝수면 2로 나누고,
홀수면 3을 곱한 다음 1을 더합니다.
결과로 나온 수에 같은 작업을 1이 될 때까지 반복
 */
public class Collatz {

    public int solution(int num) {
        int answer = 0;

        double number = num;

        while (true) {
            if (number == 1) {
                return answer;
            }
            number = (number % 2 == 0) ? number / 2 : (number * 3) + 1;
            answer++;
            if (answer == 500) {
                return -1;
            }
        }
    }

}
