package array;

public class RotateArray {
	
    public void rotate(int[] nums, int k) {
        if(k == 0) return;
        int length = nums.length;
        int rotateRight = k % length;
        if (rotateRight == 0) return;
        int[] bucket = new int[rotateRight];
        for(int i = 0; i < rotateRight; i ++) {
            bucket[i] = nums[length - (rotateRight - i)];
        }
        for(int i = 0; i < length; i ++) {
            int temp = nums[i];
            int index = i % rotateRight;
            nums[i] = bucket[index];
            bucket[index] = temp;
        }
    }

}
