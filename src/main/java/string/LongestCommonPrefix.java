package string;

public class LongestCommonPrefix {
	
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String s = strs[0];
        int length = s.length();
        for(int i = 0; i < length; i ++) {
            char c = s.charAt(i);
            for(int j = 1; j < strs.length; j ++) {
                String t = strs[j];
                if(t.length() <= i) return sb.toString();
                char d = t.charAt(i);
                if(d != c) return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }

}
