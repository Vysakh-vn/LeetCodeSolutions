package math;

public class CheckIfSumOfPowersOfThree {
	
	/**
	 * Checks whether a given integer `n` can be represented as a sum of distinct powers of three.
	 * 
	 * The approach follows a greedy method:  
	 * - We repeatedly divide `n` by 3, checking if any remainder is `2`.  
	 * - If a remainder of `2` is found, return false (since we can only use 0 or 1 of each power of 3).  
	 * - Otherwise, continue dividing until `n` is less than 3.  
	 * - Finally, ensure `n` itself is not 2 before returning true.
	 * 
	 * Time Complexity: O(log₃ n) since we keep dividing by 3.
	 * 
	 * @param n The number to check.
	 * @return true if `n` can be represented as a sum of distinct powers of three, false otherwise.
	 */
    public boolean checkPowersOfThree(int n) {
        while(n >= 3){
            if(n % 3 == 2) return false;
            n /= 3;
        }
        return n!= 2;
    }

}
