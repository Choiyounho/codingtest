package programers.level1;

// 자릿 수 더하기
public class PlusDigit {

    public int solution(int n) {
        String number =  "" + n;
        String[] numbers = number.split("");

        int answer = 0;
        for (String i : numbers) {
            answer += Integer.parseInt(i);
        }

        return answer;
    }

    // 형 변환을 사용하지 않은 풀이
    public int solution2(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

}
