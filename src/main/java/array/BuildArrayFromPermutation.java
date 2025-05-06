package array;

public class BuildArrayFromPermutation {
	
    /**
     * Build an array ans of the same length of given array nums where ans[i] = nums[nums[i]] for each 0 <= i < nums.length.
     * 
     * @param nums
     * @return
     */
    public int[] buildArray(int[] nums) {
        int[] ret = new int[nums.length];
        for(int i = 0; i < nums.length; i ++) {
            ret[i] = nums[nums[i]];
        }
        return ret;
    }

}
