package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {
	
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
