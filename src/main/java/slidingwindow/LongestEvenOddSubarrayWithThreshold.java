package slidingwindow;

public class LongestEvenOddSubarrayWithThreshold {

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
