package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {
	
	/**
	 * Finds the intersection of two integer arrays, including duplicate values.
	 * 
	 * This method returns an array containing the elements that appear in both 
	 * input arrays, considering their frequency. If a number appears `x` times in 
	 * `nums1` and `y` times in `nums2`, it will appear `min(x, y)` times in the 
	 * result. The order of appearance in the result follows the order of `nums2`.
	 * 
	 * @param nums1 the first input array of integers
	 * @param nums2 the second input array of integers
	 * @return an array containing the intersection of the two arrays
	 */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = Math.max(nums1.length, nums2.length);
        int[] result = new int[length];
        for(int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int k = 0;
        for(int n : nums2) {
            if(map.getOrDefault(n, 0) != 0) {
                result[k] = n;
                map.put(n , map.get(n) - 1);
                k ++;
            }
        }
        return Arrays.copyOf(result, k);
    }

}
