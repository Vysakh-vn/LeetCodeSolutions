package array;

public class MissingNumber {
	
	/**
	 * Finds the missing number in an array containing n distinct numbers in the range [0, n].
	 * 
	 * @param nums the input array of distinct numbers
	 * @return the missing number in the sequence
	 */
	public int missingNumber(int[] nums) {
        int reqSum = 0;
        int actSum = 0;
        for(int i = 0; i < nums.length; i ++) {
            reqSum = reqSum + (i + 1);
            actSum += nums[i];
        }
        return reqSum - actSum;
	}

}
