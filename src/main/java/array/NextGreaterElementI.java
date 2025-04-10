package array;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {
	
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
