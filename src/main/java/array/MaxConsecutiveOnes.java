package array;

public class MaxConsecutiveOnes {

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
