package string;

public class ReverseWordsInAString {
	
    /**
     * This function returns words in reverse order for an input string.
     * 
     * @param s The input string
     * @return A string of the words in reverse order concatenated by a single space.
     */
    public String reverseWords(String s) {
    	String[] words = s.split(" ");
    	int wordsCount = words.length;
    	StringBuilder reverseWords = new StringBuilder();
    	for(int i = wordsCount - 1; i >= 0; i --) {
    		if(!words[i].isBlank()) reverseWords.append(" " + words[i]);
    	}
    	return reverseWords.toString().trim();
    }

}
