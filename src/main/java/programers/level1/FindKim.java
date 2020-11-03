package programers.level1;

public class FindKim {
    public String solution(String[] seoul) {

        StringBuilder stringBuilder = new StringBuilder();
        for (String name : seoul) {
            if (name.contains("Kim")) {
                stringBuilder.append("김서방은 " + name + "에 있다");
            }
        }
        return stringBuilder.toString();
    }

}
