package slidingwindow;

public class LongestEvenOddSubarrayWithThreshold {

	/**
	 * Length of the longest subarray of nums starting at index l and ending at index r (0 <= l <= r < nums.length) that satisfies the following conditions:
	 * 
	 * nums[l] % 2 == 0
	 * For all indices i in the range [l, r - 1], nums[i] % 2 != nums[i + 1] % 2
	 * For all indices i in the range [l, r], nums[i] <= threshold
	 * 
	 * @param nums
	 * @param threshold
	 * @return
	 */
	public int longestAlternatingSubarray(int[] nums, int threshold) {
		int l = 0;
		int r = 0;
		int maxLength = 0;
		int count = 0;
		while (l < nums.length && r < nums.length) {
			if ((nums[l] % 2 == 0) && (nums[l] <= threshold)) {
				r = l + 1;
				count++;
				while (r < nums.length) {
					if ((nums[r - 1] % 2 != nums[r] % 2) && (nums[r] <= threshold)) {
						count++;
						r++;
					} else {
						maxLength = Math.max(count, maxLength);
						count = 0;
						l = r - 1;
						break;
					}
				}
			}
			l++;
		}
		return Math.max(count, maxLength);
	}

}
