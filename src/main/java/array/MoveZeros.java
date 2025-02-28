package array;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int l = nums.length;
		int j = 0;
		for(int i = 0; i < l; i ++) {
			if(nums[i] == 0) {
				if(j == 0) j = i;
				j = swapZero(nums, i, j);
			}
		}
    }

    public int swapZero(int[] nums, int i, int j) {
		for(; j < nums.length; j ++) {
			int n = nums[j];
			if(n != 0) {
				nums[i] = n;
				nums[j] = 0;
				break;
			}
		}
		return j;
	}
	
}
