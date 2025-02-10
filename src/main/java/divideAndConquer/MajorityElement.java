package divideAndConquer;

public class MajorityElement {
	
	public int getMajorityElement(int[] nums) {
		return getMajorityElement(nums, 0, nums.length - 1);
	}
	
	public int getMajorityElement(int[] nums, int left, int right) {
		if(right == left) {
			return nums[right];
		}
		
		int mid = left + (right - left) / 2;
		int majorityRight = getMajorityElement(nums, mid + 1, right);
		int majorityLeft = getMajorityElement(nums, left, mid);
		
		if(majorityRight == majorityLeft) {
			return majorityRight;
		}
		
		int occurenceLeft = countOccurences(nums, left, right, majorityLeft);
		
        int majorityThreshold = (right - left + 1) / 2;
        return occurenceLeft > majorityThreshold ? majorityLeft : majorityRight;
	}
	
	public int countOccurences(int nums[], int left, int right, int target) {
		int count = 0;
		for(int i = left; i <= right; i ++) {
			if(nums[i] == target) {
				count ++;
			}
		}
		return count;
	}
}
