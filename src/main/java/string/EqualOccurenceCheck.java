package string;

public class EqualOccurenceCheck {
	
    /**
     * Function that checks if the source string contains equal occurrence for all the characters
     * 
     * @param s string to check the occurrence
     * @return
     */
    public boolean areOccurrencesEqual(String s) {
    	int[] arr = new int[26];
    	for(char c : s.toCharArray()) {
    		arr[c - 'a'] ++;
    	}
        
    	int oc = arr[s.charAt(0) - 'a'];
    	
    	for(char c : s.toCharArray()) {
    		if(arr[c - 'a'] != oc) {
    			return false;
    		}
    	}
    	return true;
    }

}
