package array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
	
	/**
	 * Checks if the given array contains duplicate elements within a given index distance.
	 *
	 * @param nums the input array of integers
	 * @param k the maximum allowed index difference between duplicate values
	 * @return true if there are two distinct indices i and j such that nums[i] == nums[j] 
	 *         and the absolute difference between i and j is at most k, otherwise false
	 */
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++) {
            int n = nums[i];
            if(map.containsKey(n)) {
                int idx = map.get(n);
                if(Math.abs(idx - i) <= k) {
                    return true;
                }
                map.put(n, i);
            } else {
                map.put(n, i);
            }
        }
        return false;
        
    }

}
