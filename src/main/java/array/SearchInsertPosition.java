package array;

public class SearchInsertPosition {
	
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
    	  if(left == right) {
    		if(nums[left] == target) {
    			return left;
    		} else if (nums[left] < target) {
    			return left + 1;
    		} else {
    			return left;
    		}
    	}
    	
    	int mid = left + (right - left) / 2;
    	if(nums[mid] == target) {
    		return mid;
    	} else if (nums[mid] > target) {
    		return binarySearch(nums, target, left, mid);
    	} else {
    		return binarySearch(nums, target, mid + 1, right);
    	}
    }

}
