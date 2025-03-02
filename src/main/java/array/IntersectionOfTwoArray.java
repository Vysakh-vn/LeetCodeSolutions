package array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArray {

	/**
	 * Finds the intersection of two integer arrays.
	 *
	 * <p>This method takes two integer arrays and returns an array containing 
	 * the unique elements that are common in both input arrays.</p>
	 *
	 *
	 * @param nums1 The first input array of integers.
	 * @param nums2 The second input array of integers.
	 * @return An array containing the unique common elements of both arrays.
	 */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for(int n : nums2) {
            if(set1.contains(n)) {
                set2.add(n);
            }
        }
        int[] intersection = new int[set2.size()];

        int count = 0;
        Iterator<Integer> it = set2.iterator();
        while(it.hasNext()) {
            intersection[count] = it.next();
            count ++;
        }

        return intersection;
    }
	
}
