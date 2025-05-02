package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
	
    /**
     * From two strings s and p, returns an array of all the start indices of p's anagrams in s.
     * 
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        int[] lookup = new int[26];
        List<Integer> list = new ArrayList<>();
        for(char c : p.toCharArray()) {
            lookup[c - 'a'] ++;
        }
        boolean anagramFound = false;
        for(int left = 0; left <= (s.length() - p.length()); left ++) {
            char c = s.charAt(left);
            if(lookup[c - 'a'] > 0) {
                int[] copy = Arrays.copyOf(lookup, 26);
                copy[c - 'a'] --;
                anagramFound = true;
                for(int right = 1; right < p.length();  right ++) {
                    char next = s.charAt(left + right);
                    if(copy[next - 'a'] > 0) copy[next - 'a'] --;
                    else {
                        anagramFound = false;
                        break;
                    }
                }
                if(anagramFound == true) list.add(left);
            }
        }
        return list;
    }

}
