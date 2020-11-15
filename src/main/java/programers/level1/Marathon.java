package programers.level1;

import java.util.Arrays;
import java.util.Objects;

public class Marathon {

    public String solution(String[] participant, String[] completion) {
        String[] answer = {null};

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (participant[i] == completion[j]) {
                    participant[i] = null;
                    completion[j] = null;
                }
            }
        }

        Arrays.stream(participant).filter(Objects::nonNull).forEach(l -> answer[0] = l);

        return answer[0];
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
