package array;

public class FindClosestNumberToZero {
	
    public int findClosestNumber(int[] nums) {
		int min = nums[0];
		for(int n : nums) {
			if(Math.abs(n) < Math.abs(min)) {
				min = n;
			} else if (Math.abs(n) == Math.abs(min)) {
				min = n > min ? n : min;
			}
		}
		return min;
    }

}
