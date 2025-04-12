package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	
    public int lengthOfLongestSubstring(String s) {
        int j = 0;
        int size = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, i);
            } else {
                int target = map.get(c);
                while(j <= target) {
                    char r = s.charAt(j);
                    map.remove(r);
                    j ++;
                }
                map.put(c, i);
            }
            if(map.size() > size) size = map.size();
        }
        return size;
    }

}
