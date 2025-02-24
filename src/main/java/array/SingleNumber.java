package array;

public class SingleNumber {
	
    /**
     * Function to find the unique number in a list of numbers
     * 
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int n : nums) {
        	unique ^= n;
        }
        return unique;
    }

}
