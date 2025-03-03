package array;

import java.util.ArrayList;
import java.util.List;

public class PartitionArrayAccordingToPivot {

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
