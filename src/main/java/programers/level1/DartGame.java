package programers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 카카오 인턴 쉽 : 다트 게임
public class DartGame {

    public int solution(String dartResult) {
        String[] dartResults = dartResult.split("[^0-9]");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < dartResults.length; i++) {
            if (isNumeric(dartResults[i])) {
                numbers.add(Integer.parseInt(dartResults[i]));
            }
        }

        int point = numbers.get(0);
        int bonus = numbers.get(1);
        int option = numbers.get(2);

        StringTokenizer stringTokenizer = new StringTokenizer(dartResult);

        String[] pointEffect = stringTokenizer.nextToken("[0,123456789]").split("");
        String[] bonusEffect = stringTokenizer.nextToken("[0,123456789]").split("");
        String[] optionEffect = stringTokenizer.nextToken("[0,123456789]").split("");

        for (int i = 0; i < pointEffect.length; i++) {
            point = getCalculate(point, pointEffect, i);
            if (pointEffect[i].equals("*")) {
                point *= 2;
            }
            if (pointEffect[i].equals("#")) {
                point *= -1;
            }
        }

        for (int j = 0; j < bonusEffect.length; j++) {
            bonus = getCalculate(bonus, bonusEffect, j);
            if (bonusEffect[j].equals("*")) {
                bonus *= 2;
                point *= 2;
            }
            if (bonusEffect[j].equals("#")) {
                bonus *= -1;
            }
        }

        for (int k = 0; k < optionEffect.length; k++) {
            option = getCalculate(option, optionEffect, k);
            if (optionEffect[k].equals("*")) {

                bonus *= 2;
                option *= 2;
            }
            if (optionEffect[k].equals("#")) {
                option *= -1;
            }
        }

        return bonus + point + option;
    }

    private int getCalculate(int bonus, String[] bonusEffect, int j) {
        if (isNumeric(bonusEffect[j])) {
            bonus += Integer.parseInt(bonusEffect[j]);
        }
        if (bonusEffect[j].equals("S")) {
            bonus = (int) Math.pow(bonus, 1);
        }
        if (bonusEffect[j].equals("D")) {
            bonus = (int) Math.pow(bonus, 2);
        }
        if (bonusEffect[j].equals("T")) {
            bonus = (int) Math.pow(bonus, 3);
        }
        return bonus;
    }

    private static boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
