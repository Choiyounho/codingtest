package programers.level1;

// 핸드폰 번호 가리기
public class CoverNumber {

    public String solution(String phone_number) {
        String[] numbers = phone_number.split("");

        for (int i = 0; i < numbers.length - 4; i++) {
            numbers[i] = "*";
        }

        StringBuilder answer = new StringBuilder();
        for (String number : numbers) {
            answer.append(number);
        }

        return answer.toString();
    }

}
