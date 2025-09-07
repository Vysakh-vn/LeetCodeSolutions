package string;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
	
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char c : jewels.toCharArray()) {
            set.add(c);
        }

        for(char ch : stones.toCharArray()) {
            if(set.contains(ch)) count ++;
        }
        return count;
    }

}
