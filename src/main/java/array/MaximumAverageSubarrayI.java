package array;

public class MaximumAverageSubarrayI {
	
    /**
     * Finds the max average in k elements for the given array.
     * 
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
    	double maxAverage = 0;
    	double sum = 0;
    	for(int i = 0; i < k; i ++) {
    		sum = sum + nums[i];
    	}
    	maxAverage = sum / k;
    	
    	for(int i = k; i < nums.length; i ++) {
    		sum = (sum - nums[i - k]) + nums[i];
    		double avg = sum / k;
    		if(avg > maxAverage) {
    			maxAverage = avg;
    		}
    	}
        return maxAverage;
    }

}
