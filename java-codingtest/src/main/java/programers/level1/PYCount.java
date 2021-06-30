package programers.level1;

// 문자열 내 p와 y의 개수
public class PYCount {

    public boolean solution(String s) {
        String[] strings = s.split("");
        int pCount = 0;
        int yCount = 0;

        for (String string : strings) {
            if (string.equals("p") || string.equals("P")) {
                pCount++;
            }
            if (string.equals("y") || string.equals("Y")) {
                yCount++;
            }
        }

        return pCount == yCount;
    }

}
