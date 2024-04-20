package array;

public class TwoSum {
	
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
