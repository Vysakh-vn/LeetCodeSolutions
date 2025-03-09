package string;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
	
    public int minimumRecolors(String blocks, int k) {
        int w = 0;
        int least = 0;
        char[] c = blocks.toCharArray();
        for(int i = 0; i < k; i ++) {
           if(c[i] == 'W') {
               w++;
           }
        }
        if(w == 0) return 0;
           least = w;
           for(int j = k; j < c.length; j ++) {
               if(c[j] == 'W') w++;
               if(c[j - k] == 'W') w--;
               if(w < least) least = w;
           }
           return least;
       }

}
