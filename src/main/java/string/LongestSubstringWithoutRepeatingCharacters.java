package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	
	
    /**
     * Function finds the longest substring without repeating characters from a given string.
     * 
     * @param s
     * @return length of longest non repeating character sequence.
     */
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
