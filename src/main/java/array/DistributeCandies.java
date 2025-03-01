package array;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	
	/**
	 * Determines the maximum number of unique candy types Alice can eat.
	 *
	 * <p>Given an integer array representing different types of candies, 
	 * this function calculates the maximum number of unique candies that 
	 * can be distributed to Alice. The total number of candies is 
	 * always even, and she can eat at most half of them.</p>
	 *
	 * @param candyType An array of integers representing different candy types.
	 * @return The maximum number of unique candy types Alice can eat.
	 */
    public int distributeCandies(int[] candyType) {
        int l = candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int n : candyType) {
            set.add(n);
        }
        if(set.size() < l/2) {
            return set.size();
        } 
        return l / 2;
    }

}
