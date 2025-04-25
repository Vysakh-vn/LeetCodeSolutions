package array;

import java.util.List;

public class MinimumPositiveSumSubarray {
	
	
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
    	int minSum = 0;
    	int tempSum = 0;
    	int size = 0;
    	for(int left = 0; left < nums.size(); left ++) {
    		tempSum = 0;
    		for(int right = left; right < nums.size(); right ++) {
    			size = (right - left) + 1;
    			tempSum += nums.get(right);
    			if(size >= l && size <= r) {
    				if(tempSum > 0 && (minSum == 0 || tempSum < minSum)) minSum = tempSum;
    			}
    		}
    	}

        return minSum > 0 ? minSum : -1;
    }

}
