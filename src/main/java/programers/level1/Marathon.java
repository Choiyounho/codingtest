package programers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Marathon {

    public String solution(String[] participant, String[] completion) {
        Map<Integer, String> participantMap = new HashMap<>();
        Map<Integer, String> completionMap = new HashMap<>();

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {
            participantMap.put(i, participant[i]);
        }

        for (int j = 0; j < completion.length; j++) {
            completionMap.put(j, completion[j]);
        }

        String answer = "";
        for (int k = 0; k < completion.length; k++) {
            if (!(participantMap.get(k).equals(completionMap.get(k)))) {
                answer = participantMap.get(k);
                break;
            }
        }

        if (answer.equals("")) {
            answer = participantMap.get(participant.length - 1);
        }

        return answer;
    }

    public String solution2(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = participant[participant.length - 1];

        for (int i = 0; i < completion.length; i++) {
            if (!(participant[i].equals(completion[i]))) {
                answer = participant[i];
                break;
            }
        }

        return answer;
    }

}
