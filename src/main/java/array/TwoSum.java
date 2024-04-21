package array;

/**
 * @author Vysakh V N
 * @since 2024-04-20
 */
public class TwoSum {
	
	/**
	 * This method finds the indices of the two numbers in a given array that add up to a specific target value.
	 * 
	 * @param nums   The integer array to search.
	 * @param target  The target sum value to find.
	 * @return  An integer array of size 2 containing the indices of the two numbers that add up to the target,
	 *          or null if no such pair exists.
	 */
	private int[] twoSum(int[] nums, int target) {        
        int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int firstNumber = nums[i];
			for (int j = i + 1; j < nums.length; j++) {

				int secondNumber = nums[j];
				int targetCheck = firstNumber + secondNumber;
				if (targetCheck == target) {
					result[0] = i;
					result[1] = j;
				}

			}
		}
		return result;
    }
	
	public static void main(String args[]) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] indeces = new TwoSum().twoSum(nums, target);
		for(int index : indeces) {
			System.out.println(index);
		}
	}

}
