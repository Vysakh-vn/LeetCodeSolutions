package string;

public class ReverseString {
	
    public void reverseString(char[] s) {
        int l = s.length;
        for(int i = l - 1,j = 0; i > j; i --,j++) {
        	char t = s[i];
        	s[i] = s[j];
        	s[j] = t;
        }
    }

}
