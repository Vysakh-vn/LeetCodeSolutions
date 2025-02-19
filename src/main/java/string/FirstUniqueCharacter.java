package string;

public class FirstUniqueCharacter {
	
    public int firstUniqueChar(String s) {
        int[] arr = new int[128];
        char[] c = s.toCharArray();
        for(char sc : c) {
        	arr[sc - 'a']++;
        }
        
        for(int i = 0; i < c.length; i ++) {
        	char sc = c[i];
        	if(arr[sc - 'a'] == 1) {
        		return i;
        	}
        }
        return -1;
    }

}
