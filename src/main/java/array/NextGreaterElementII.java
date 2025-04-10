package array;

public class NextGreaterElementII {
	
	/**
	 * Finds the next greater element for each element in a circular array.
	 *
	 * For each element in the input array, this method searches forward (with wrapping around to the beginning of the array)
	 * to find the next element that is greater than the current one. If no such element exists, -1 is returned for that position.
	 *
	 * This simulates a circular array where the end connects to the beginning.
	 *
	 * @param nums An array of integers representing the circular input.
	 * @return An array where each element is the next greater value in the circular array, or -1 if none exists.
	 */
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
