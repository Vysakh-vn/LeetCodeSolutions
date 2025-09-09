package string;

public class MergeStringsAlternately {
	
    public String mergeAlternately(String word1, String word2) {
        int count = 0;
        int length = word1.length() + word2.length();
        int i = 0;
        int j = 0;
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        while(count < length) {
            if(first) {
                if(i > word1.length() - 1) {
                    sb.append(word2.substring(j));
                    break;
                }
                char c = word1.charAt(i);
                sb.append(c);
                first = false;
                i ++;
                count ++;
            } else {
                if(j > word2.length() - 1) {
                    sb.append(word1.substring(i));
                    break;
                }
                char c = word2.charAt(j);
                sb.append(c);
                first = true;
                j ++;
                count ++;
            }
        }
        return sb.toString();
    }

}
