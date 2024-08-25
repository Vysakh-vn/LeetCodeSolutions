package string;

public class ReverseString {
	
    /**
     * This functions reorders the input char array into reverse order.
     * 
     * @param s input char array
     */
    public void reverseString(char[] s) {
        int l = s.length;
        for(int i = l - 1,j = 0; i > j; i --,j++) {
        	char t = s[i];
        	s[i] = s[j];
        	s[j] = t;
        }
    }

}
