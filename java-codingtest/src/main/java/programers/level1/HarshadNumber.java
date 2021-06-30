package programers.level1;

public class HarshadNumber {

    public boolean solution(int x) {
        int init = x;
        int sumDigit = 0;

        while (x != 0) {
            sumDigit += x % 10;
            x /= 10;
        }
        return init % sumDigit == 0;
    }

}
