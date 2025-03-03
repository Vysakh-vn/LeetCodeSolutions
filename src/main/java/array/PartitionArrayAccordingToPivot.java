package array;

import java.util.ArrayList;
import java.util.List;

public class PartitionArrayAccordingToPivot {

	/**
	 * Rearranges an array such that elements are partitioned around a pivot value.
	 * 
	 * This method partitions the input array into three groups:
	 * - Elements smaller than the pivot.
	 * - Elements equal to the pivot.
	 * - Elements greater than the pivot.
	 * 
	 * The final array maintains the relative order of elements within each group.
	 * The input array `nums` is modified in place and returned.
	 * 
	 * @param nums the input array of integers
	 * @param pivot the pivot value used for partitioning
	 * @return the modified array with elements partitioned around the pivot
	 */
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> pivotArr = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();

        for(int n : nums) {
            if(n < pivot) {
                smaller.add(n);
            } else if (n > pivot) {
                larger.add(n);
            } else if (n == pivot) {
                pivotArr.add(n);
            }
        }

        for(int i = 0; i < nums.length; i ++) {
            if(i < smaller.size()) {
                nums[i] = smaller.get(i);
            } else if (i < smaller.size() + pivotArr.size()) {
                nums[i] = pivotArr.get(i - smaller.size());
            } else if (i < (smaller.size() + pivotArr.size() + larger.size())) {
                nums[i] = larger.get(i - (smaller.size() + pivotArr.size()));
            }
        }
        return nums;
    }
	
}
