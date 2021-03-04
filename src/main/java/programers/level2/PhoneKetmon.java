package programers.level2;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬
public class PhoneKetmon {

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        return Math.min(set.size(), nums.length / 2);
    }


}
