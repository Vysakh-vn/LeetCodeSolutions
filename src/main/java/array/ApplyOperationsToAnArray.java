package array;

public class ApplyOperationsToAnArray {
	
	/**
	 * Applies operations on the given array as per the following rules:
	 * <ul>
	 *     <li>If two consecutive elements are equal, double the first element and set the second element to 0.</li>
	 *     <li>After processing all elements, shift all non-zero elements to the left while maintaining their relative order.</li>
	 * </ul>
	 *
	 * @param nums An array of integers on which the operations will be applied.
	 * @return The modified array after applying the operations.
	 */
    public int[] applyOperations(int[] nums) {
        for(int i = 0; i < nums.length - 1; i ++) {
            if(nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int k = 0;
        for(int j = 0; j < nums.length; j ++) {
            if(nums[j] != 0) {
            int temp = nums[j];
            nums[j] = 0;
            nums[k] = temp;
            k ++;
            }
        }
        return nums;
    }
	
}
