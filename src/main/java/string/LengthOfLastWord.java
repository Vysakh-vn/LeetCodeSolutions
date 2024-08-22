package string;

/**
 * @author Vysakh VN
 *
 */
public class LengthOfLastWord {
	
	
	/**
	 * Function to find the length of last word in the sentence.
	 * 
	 * @param s sentence from which to find the last word's length.
	 * @return the of length word in the sentence
	 */
	public int getLengthOfLastWord(String s) {		
		String m = s.trim();
		int i = m.length();
		int l = 0;
		while(i > 0 && m.charAt(i - 1) != ' ') {
			l ++;
			i --;
		}
		return l;
	}
	

}
