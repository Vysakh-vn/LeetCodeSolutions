package string;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
	
    public int maxNumberOfBalloons(String text) {
        int count = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String balloon = "balloon";
        for(char c : balloon.toCharArray()) {
            int freq = map.getOrDefault(c, 0);
            if(c == 'l' || c == 'o') freq = freq / 2;
            count = Math.min(freq, count);
        }
        return count;
    }

}
