package array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	
    /**
     * Function removes the duplicates from the array while maintaining the sorting order
     * 
     * @param nums array to remove duplicates from
     * @return count of the duplicate elements
     */
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int k = length;
        for(int i = 1; i < length; i ++) {
           if(nums[i -1] == nums[i]) {
               nums[i-1] = 101;
               k --;
           }
        }
        Arrays.sort(nums);
        return k;
   }

}
