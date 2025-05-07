package slidingwindow;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {
	
	/**
	 * Finds the length of the longest harmonious subsequence in the given array.
	 * A harmonious subsequence is where the difference between the maximum and 
	 * minimum values is exactly 1.
	 *
	 * @param nums The input array of integers.
	 * @return The length of the longest harmonious subsequence.
	 */
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxCount = 0;
        int right = 1;
        int left = 0;
        while(right < nums.length) {
            int diff = nums[right] - nums[left];
            if(diff == 1) {
                maxCount = Math.max(maxCount, right - left + 1);
            }
            if(diff <= 1) right ++;
            else left ++;
        }
        return maxCount;
    }

}
