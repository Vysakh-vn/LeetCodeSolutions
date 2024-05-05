package array;

public class FirstMissingPositive {
	
	/**
	 * 
	 * Find the smallest positive integer missing from a given unsorted array. 
	 * 
	 * @param nums Unsorted array of integer.
	 * @return The smallest positive integer from the array.
	 */
	public int firstMissingPositive(int[] nums) {
		int n = nums.length;
	    boolean[] present = new boolean[n + 1];
	    for (int num : nums) {
	        if (num > 0 && num <= n) {
	            present[num] = true;
	        }
	    }
	    for (int i = 1; i <= n; i++) {
	        if (!present[i]) {
	            return i;
	        }
	    }
	    return n + 1;
		}

}
