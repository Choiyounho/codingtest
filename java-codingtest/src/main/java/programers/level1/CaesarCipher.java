package programers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaesarCipher {

    public String solution(String s, int n) {
        String[] alphabet = s.split("");

        List<String> lowercase = new ArrayList<>();

        String lowercaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] lowercaseAlphabets = lowercaseAlphabet.split("");
        Collections.addAll(lowercase, lowercaseAlphabets);

        List<String> uppercase = new ArrayList<>();

        String uppercaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] uppercaseAlphabets = uppercaseAlphabet.split("");
        Collections.addAll(uppercase, uppercaseAlphabets);

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals("")) {
                continue;
            }
            if (lowercase.contains(alphabet[i])) {
                if (lowercase.indexOf(alphabet[i]) + n > 25) {
                    alphabet[i] = lowercase.get((lowercase.indexOf(alphabet[i]) + n) - 26);
                } else {
                    alphabet[i] = lowercase.get(lowercase.indexOf(alphabet[i]) + n);
                }
            }
            if (uppercase.contains(alphabet[i])) {
                if (uppercase.indexOf(alphabet[i]) + n > 25) {
                    alphabet[i] = uppercase.get((uppercase.indexOf(alphabet[i]) + n) - 26);
                } else {
                    alphabet[i] = uppercase.get(uppercase.indexOf(alphabet[i]) + n);
                }
            }
        }

        String answer = "";
        for (int j = 0; j < alphabet.length; j++) {
            answer += alphabet[j];
        }
        return answer;
    }

}
