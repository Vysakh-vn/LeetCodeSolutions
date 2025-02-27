package array;

public class MissingNumber {
	
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
