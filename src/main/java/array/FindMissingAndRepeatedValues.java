package array;

public class FindMissingAndRepeatedValues {

	/**
	 * Finds the missing and repeated values in an n x n grid where numbers should
	 * be from 1 to n^2 exactly once, but one number is missing and another is
	 * duplicated.
	 *
	 * @param grid A 2D integer array of size n x n containing numbers from 1 to n^2
	 *             with one missing and one repeated value.
	 * @return An integer array of size 2 where: - result[0] is the repeated number.
	 *         - result[1] is the missing number.
	 */
	public int[] findMissingAndRepeatedValues(int[][] grid) {
		int n = grid.length;
		int[] result = new int[2];
		boolean[] check = new boolean[n * n];
		int sum = 0;
		int actual = 0;
		int duplicate = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int value = grid[i][j];
				if (!check[value - 1]) {
					check[value - 1] = true;
					actual += value;
				} else {
					duplicate = value;
				}
				count++;
				sum += count;
			}
		}
		result[0] = duplicate;
		result[1] = sum - actual;
		return result;
	}

}
