package string;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
	
	/**
	 * This method finds the minimum number of recolors needed to get at least `k` consecutive 'B' (black) blocks
	 * in the given string `blocks`. It uses a sliding window approach to efficiently determine the minimum number 
	 * of 'W' (white) blocks that need to be changed to 'B' within any `k`-sized contiguous segment.
	 * 
	 * @param blocks A string consisting of characters 'B' and 'W', representing a sequence of blocks.
	 * @param k The required length of consecutive 'B' blocks.
	 * @return The minimum number of 'W' blocks that must be recolored to form a contiguous sequence of `k` 'B' blocks.
	 * 
	 * Approach:
	 * - First, count the number of 'W' blocks in the initial window of size `k`.
	 * - Use a sliding window technique to move through `blocks`, updating the count of 'W' blocks efficiently.
	 * - Track the minimum number of 'W' blocks found in any window, as that will be the answer.
	 * - Return the minimum count of 'W' that need to be recolored.
	 */
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
