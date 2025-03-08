package array;

import java.util.Arrays;

public class MergeSortedArray {
	
	
    /**
     * Function to merge to sorted array
     * 
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i ++ ) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

}
