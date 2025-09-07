package string;

public class ShortestDistanceToACharacter {
	
    public int[] shortestToChar(String s, char c) {
        int value = s.length() - 1;
        int j = 0;
        boolean found = false;
        int[] ans = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == c) {
                while(j <= i) {
                    ans[j] = Math.min(ans[j], (i - j));
                    j ++;
                    found = true;
                    value = 1;
                }
            } else {
                ans[i] = value;
                if(found) value ++;
                else value --;
            }
        }
        return ans;
    }

}
