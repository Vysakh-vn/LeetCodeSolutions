package array;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {
	
	/**
	 * Finds the next greater element for each element in nums1 based on their positions in nums2.
	 *
	 * For each element in nums1, this method finds the index of that element in nums2,
	 * then searches to the right of that index in nums2 for the first element that is greater.
	 * If no such element is found, -1 is returned for that position.
	 *
	 * @param nums1 An array of integers representing the subset of elements to find next greater values for.
	 * @param nums2 An array of integers representing the superset in which next greater elements are searched.
	 * @return An array where each element corresponds to the next greater value of nums1[i] in nums2, or -1 if none exists.
	 */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> lookup = new HashMap<>();
		int[] result = new int[nums1.length];
		int count = 0;
		for(int n : nums2) {
			lookup.put(n, count);
			count ++; 
		}

		for(int i = 0; i < nums1.length; i ++) {
			int n = nums1[i];
			result[i] = getGreater(nums2, lookup.get(n) + 1, n);
		}
		return result;
    }

    private int getGreater(int[] nums2, int startIndex, int target) {
		for(int i = startIndex; i < nums2.length; i ++) {
			if(nums2[i] > target) return nums2[i];
		}
		return -1;
	}
}
