package string;

public class IsSubsquence {
	
    /**
     * Function to find if a string s is a subsequence of string t
     * 
     * @param s subsequence to check
     * @param t target string
     * @return
     */
    public boolean isSubsequence(String s, String t) {
    	int idx = 0;
    	int sl = s.length();
    	int tl = t.length();
    	for(int i = 0; i < tl; i ++ ) {
    		if(idx >= sl) {
    			return true;
    		}
        	char sc = s.charAt(idx);
    		char tc = t.charAt(i);
    		if(sc == tc) {
    			idx ++;
    		}
    	}
    	return idx == sl;
    }

}
