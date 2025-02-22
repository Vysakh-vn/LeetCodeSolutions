package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	
	/**
	 * Function to check if an array contains all unique entries
	 * 
	 * @param nums array to check for duplicates 
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int n : nums) {
			if (!set.add(n)) {
				return true;
			}
		}
		return false;
	}

}
