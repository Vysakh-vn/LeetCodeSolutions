package array;

public class CheckIfArrayIsSortedAndRotated {
	
    public boolean check(int[] nums) {
        int startingIndex = 0;
        for(int i = 1; i < nums.length; i ++) {
            if(nums[i - 1] > nums[i]) {
                startingIndex = i;
                break;
            }
        }

        for(int j = 0; j < nums.length - 1; j ++) {
            int index = (j + startingIndex) % nums.length;
            int nextIndex = (j + startingIndex + 1) % nums.length;
            if(nums[index] > nums[nextIndex]) return false;
        }
        return true;
    }

}
