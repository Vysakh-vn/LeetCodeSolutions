package array;

public class SingleNumber {
	
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int n : nums) {
        	unique ^= n;
        }
        return unique;
    }

}
