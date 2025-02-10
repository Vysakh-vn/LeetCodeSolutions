package dynamicProgramming;

public class Search2DMatrixII {

	public boolean searchMatrix(int[][] matrix, int target) {
		for(int[] row : matrix) {
			boolean isElementFound = binarySearch(row, target, 0, row.length - 1);
			if(isElementFound) return true;
		}
		return false;
	}
	
	public boolean binarySearch(int[] row, int target, int left, int right) {
		if(right == left) {
			return row[right] == target;
		}
		
		int mid = left + (right - left) / 2;
		if(row[mid] == target) {
			return true;
		} else if (target > row[mid]) {
			return binarySearch(row, target, mid + 1, right);
		} else {
			return binarySearch(row, target, left, mid);
		}
	}
	
}
