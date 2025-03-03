package array;

import java.util.Arrays;

public class ArrayPartition {
	
	/**
	 * Computes the maximum sum of paired minimums from an integer array.
	 * 
	 * This method first sorts the input array in ascending order. Then, it forms 
	 * pairs by taking every two consecutive elements and adds the first element 
	 * of each pair to the sum. Since sorting ensures that the first element of 
	 * each pair is always the smaller one, this guarantees the maximum possible 
	 * sum of all paired minimums.
	 * 
	 * @param nums the input array of integers (must contain an even number of elements)
	 * @return the maximum sum of paired minimum values
	 */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = i+2) {
            sum += nums[i];
        }
        return sum;
    }
	
}
