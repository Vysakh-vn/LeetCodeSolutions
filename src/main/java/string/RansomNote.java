package string;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < ransomNote.length(); i ++) {
            char c = ransomNote.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int j = 0; j < magazine.length(); j ++) {
            char d = magazine.charAt(j);
            if(map.containsKey(d)) {
                int count = map.get(d);
                count --;
                if(count == 0) map.remove(d);
                else map.put(d, count);
            }
        }
        return map.size() == 0;
    }

}
