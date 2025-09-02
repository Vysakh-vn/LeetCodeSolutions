package string;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");

        int l = strs.length;
        int m = pattern.length();
        if(l != m) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for(int i = 0; i < pattern.length(); i ++) {
            char c = pattern.charAt(i);
            if(map.containsKey(c)) {
                String t = map.get(c);
                if(!strs[i].equals(t)) return false;
            } else {               
                map.put(c, strs[i]);
            }

            if(map2.containsKey(strs[i])) {
                char d = map2.get(strs[i]);
                if(d != c) return false;
            } else {
                map2.put(strs[i], c);
            }
        }
        return true;
    }
	
}

