package slidingwindow;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {
	
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
