package mystudy;

import static utils.CommonsConstant.RANDOM;
import static utils.CommonsConstant.SCANNER;

/**
 * startNumber 부터 endNumber 까지의 랜덤 숫자 맞추기
 * 횟수제한은 없으며, 범위를 벗어난 숫자를 입력하여도 count++
 */

public class FindRandomNumber {

    public static void main(String[] args) {
        System.out.println("시작 값");
        System.out.print(">>> ");
        int startNumber = SCANNER.nextInt();

        System.out.println("끝 값");
        System.out.print(">>> ");
        int endNumber = SCANNER.nextInt();

        findNumber(startNumber, endNumber);
    }

    private static void findNumber(int startNumber, int endNumber) {
        int result = RANDOM.nextInt(endNumber - startNumber) + startNumber;
        int count = 0;

        while (true) {
            System.out.println(startNumber + "~" + endNumber + "값을 입력하세요 : ");
            System.out.print(">>> ");

            int input = SCANNER.nextInt();

            if (isNotRange(input, startNumber, endNumber)) {
                System.out.println("잘못 입력하였습니다.");
                count++;
                continue;
            }
            if (isAnswer(input, result)) {
                count++;
                break;
            }
            if (isSmall(input, result)) {
                count++;
                System.out.println("Up");
            }
            if (!isSmall(input, result)) {
                count++;
                System.out.println("Down");
            }
        }
        System.out.println("정답 입니다.!");
        System.out.println("시도 횟수는 " + count + "번입니다.");
    }

    private static boolean isNotRange(int input, int startNumber, int endNumber) {
        return input < startNumber || input > endNumber;
    }

    private static boolean isSmall(int input, int result) {
        return input < result;
    }

    private static boolean isAnswer(int input, int result) {
        return input == result;
    }

}
