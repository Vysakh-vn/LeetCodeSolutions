package string;

public class FirstUniqueCharacter {
	
    /**
     * FInds and returns the index of first unique character in a string
     * 
     * @param s source string to find the first unique character
     * @return index of unique character, if no unique character is found returns -1
     */
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
