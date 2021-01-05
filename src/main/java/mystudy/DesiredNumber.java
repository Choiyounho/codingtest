package mystudy;

import static utils.CommonsConstant.SCANNER;

/**
 * 홀수 번째 숫자는 더하고, 짝수번째 숫자는 뺀다.
 * 원하는 숫자가 나올때 까지 반복
 */

public class DesiredNumber {

    public static void main(String[] args) {
        System.out.println("원하는 숫자");
        System.out.print(">>> ");

        int desiredNumber = SCANNER.nextInt();
        
        getResult(desiredNumber);
    }

    private static void getResult(int result) {
        int number = 0;
        int sum = 0;

        while (true) {
            number++;
            if (isOddNumber(number)) {
                sum += number;
            }
            if (isEvenNumber(number)) {
                sum -= number;
            }
            if (isSameNumber(sum, result)) {
                System.out.println(number);
                break;
            }
        }
    }

    private static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private static boolean isSameNumber(int number, int number1) {
        return number == number1;
    }

}
