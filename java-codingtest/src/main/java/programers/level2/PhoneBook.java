package programers.level2;

import java.util.*;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        Map<Integer, String> map = initMap(phone_book);

        return getResult(map);
    }

    private Map<Integer, String> initMap(String[] phone_book) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(i, phone_book[i]);
        }

        return map;
    }

    private boolean getResult(Map<Integer, String> map) {
        for (int i = 0; i < map.size() - 1; i++) {
            if (map.get(i + 1).startsWith(map.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean noHash(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[i].startsWith(phone_book[j]) && phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
