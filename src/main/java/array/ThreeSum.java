package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	/**
	 * Finds all unique triplets in the array which sum up to zero.
	 *
	 * This method uses the two-pointer approach on a sorted array to efficiently
	 * find all combinations of three numbers (a, b, c) such that a + b + c = 0.
	 * Duplicate triplets are skipped to ensure the result contains only unique triplets.
	 *
	 * @param nums The input array of integers.
	 * @return A list of lists containing all unique triplets that sum to zero.
	 */
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while (left < right && nums[left] == nums[left + 1])
						left++;
					while (left < right && nums[right] == nums[right - 1])
						right--;

					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}

		return result;
	}

}
