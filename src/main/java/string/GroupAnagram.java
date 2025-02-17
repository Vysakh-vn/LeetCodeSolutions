package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
	
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        int length = strs.length;

        String[] sorted = new String[length];
        for(int i = 0; i < length; i ++) {
        	char[] s = strs[i].toCharArray();
        	Arrays.sort(s);
        	sorted[i] = new String(s);
        }
        
        boolean[] searched = new boolean[length];
        
        for(int j = 0; j < length; j ++) {
        	if(!searched[j]) {
            	String s = sorted[j];
            	List<String> group = new ArrayList<>();
            	for(int k = j; k < length; k ++) {
            		String target = sorted[k];
            		if(!searched[k] && target.equals(s)) {
            			group.add(strs[k]);
            			searched[k] = true;
            		}
            	}
            	groups.add(group);
        	}
        }
        return groups;

    }

}
