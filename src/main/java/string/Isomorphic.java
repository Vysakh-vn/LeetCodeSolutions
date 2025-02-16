package string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
       	int length = s.length();
		Map<Character, Character> map = new HashMap<>();
		Map<Character, Character> map2 = new HashMap<>();
		for(int i = 0; i < length; i ++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);
			if(map.containsKey(sc) && (map.get(sc) != tc)) {
				return false;
			} else if (map2.containsKey(tc) && (map2.get(tc) != sc)) {
				return false;
			} else {
				map.put(sc, tc);
				map2.put(tc, sc);
			}
		}
		return true;
    }

}
