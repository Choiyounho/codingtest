package programers.level1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewId {

    public static String solution(String new_id) {
        new_id = new_id.toLowerCase();// 1단계 소문자화

        List<String> passList = new ArrayList<>(); // 2단계에 이용할 리스트

        addList(passList);

        String[] temp = new_id.split("");

        List<String> newIds = new ArrayList<>();

        Collections.addAll(newIds, temp);

        int length = new_id.length();

        // 2단계
        for (int i = 0; i < length; i++) {
            if (!passList.contains(newIds.get(i))) {
                newIds.remove(i); // 코틀린이었다면 removeRange
                i--;
                length--;
            }
        }

        // 3 단계
        int size = newIds.size();
        for (int i = 0; i < size - 1; i++) {
            if (newIds.get(i).equals(".") && newIds.get(i + 1).equals(".")) {
                newIds.remove(i);
                i--;
                size--;
            }
        }

        // 4단계
        while (newIds.get(0).equals(".") || newIds.get(newIds.size() - 1).equals(".")) {
            if (newIds.get(0).equals(".")) {
                newIds.remove(0);
            }

            if (newIds.size() == 0) {
                return "aaa";
            }

            if (newIds.get(newIds.size() - 1).equals(".")) {
                newIds.remove(newIds.size() - 1);
            }

            if (newIds.size() == 0) {
                return "aaa";
            }
        }

        // 5단계
        if (new_id.isEmpty()) {
            return "aaa";
        }

        // 6단계
        size = newIds.size();
        if (newIds.size() > 15) {
            if (newIds.size() == 16) {
                newIds.remove(newIds.size() - 1);
            } else {
                for (int i = 15; i < size; i++) {
                    newIds.remove(i);
                    size--;
                    i--;
                }
            }
        }

        if (newIds.get(newIds.size() - 1).equals(".")) {
            newIds.remove(newIds.size() - 1);
        }

        // 7단계 - 반복문으로 바꾸기
        if (newIds.size() == 1) {
            newIds.add(newIds.get(0));
            newIds.add(newIds.get(0));
        }

        if (newIds.size() == 2) {
            newIds.add(newIds.get(1));
        }

        new_id = "";

        for (int i = 0; i < newIds.size(); i++) {
            new_id = new_id + newIds.get(i);
        }

        return new_id;
    }

    public static void addList(List<String> passList) {
        for (int i = 97; i <= 122; i++) {
            passList.add(String.valueOf((char) i));
        }

        for (int i = 0; i < 10; i++) {
            passList.add(i + "");
        }

        passList.add("-");
        passList.add("_");
        passList.add(".");
    }

}
