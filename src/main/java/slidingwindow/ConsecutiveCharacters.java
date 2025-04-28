package slidingwindow;

public class ConsecutiveCharacters {
	
    public int maxPower(String s) {
        int maxCount = 1;
        char current = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i ++) {
            char c = s.charAt(i);
            if(c == current) count ++;
            else {
                maxCount = Math.max(count, maxCount);
                current = c;
                count = 1;
            }
        }
        return Math.max(count, maxCount);
    }

}
