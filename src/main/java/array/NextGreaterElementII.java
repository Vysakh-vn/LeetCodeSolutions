package array;

public class NextGreaterElementII {
	
	public int[] nextGreaterElements(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			result[i] = getNextGreater(nums, i, n);
		}
		return result;
	}

	private int getNextGreater(int[] nums, int index, int target) {
		for (int i = 1; i < nums.length; i++) {
			int j = index + i;
			if (j >= nums.length)
				j = j - nums.length;
			if (nums[j] > target)
				return nums[j];
		}
		return -1;
	}

}
