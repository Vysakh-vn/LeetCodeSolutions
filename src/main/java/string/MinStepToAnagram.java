package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinStepToAnagram {
	
    public int minSteps(String s, String t) {
        char[] sc = s.toCharArray();
        Arrays.sort(sc);
        char[] tc = t.toCharArray();
        Arrays.sort(tc);
        
        if(new String(sc).equals(new String(tc))) {
        	return 0;
        }

        return getCharacterDifferenceCount(sc, tc);
    }
    
    public int getCharacterDifferenceCount(char[] sc, char[] tc) {
    	
    	Map<Character, Integer> sourceMap = new HashMap<>();
    	Map<Character, Integer> targetMap = new HashMap<>();
    	
    	int length = sc.length;
    	int count = 0;
    	for(int i = 0; i < length; i ++) {
    		char s = sc[i];
    		char t = tc[i];
    		
    		sourceMap.put(s, sourceMap.getOrDefault(s, 0) + 1);
    		targetMap.put(t, targetMap.getOrDefault(t, 0) + 1);
    	}
    	
    	for(int j = 0; j < length; j ++) {
    		char s = sc[j];
    		int df = sourceMap.getOrDefault(s, 0) - targetMap.getOrDefault(s, 0);
    		if(df > 0) {
    			count = count + df;
    		}
    		sourceMap.put(s, 0);
    		targetMap.put(s, 0);
    	}
    	
    	return count;
    }

}
