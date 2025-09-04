package string;

public class ReverseWordsInAStringIII {
	
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder stb = new StringBuilder();
        for(String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            stb.append(reverse).append(" ");
        }
        return stb.toString().trim();
    }

}
