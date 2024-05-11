package array;

/**
 * @author Vysakh VN
 * @since 2024-05-11
 */
public class MaxConsecutiveOnes {

	/**
	 * Finds the maximum number of consecutive ones in a given integer array.
	 * 
	 * @param nums An integer array.
	 * @return The maximum number of consecutive ones in the array.
	 */
	public int findMaxConsecutiveOnes(int[] nums) {

		int maxOnes = 0;
		int temp = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++) {

			int value = nums[i];
			if (value == 1) {
				temp++;
			} else {
				temp = 0;
			}
			if (temp > maxOnes) {
				maxOnes = temp;
			}

		}
		return maxOnes;

	}

}
