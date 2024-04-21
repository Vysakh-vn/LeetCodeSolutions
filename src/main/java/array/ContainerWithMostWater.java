package array;

/**
 * @author Vysakh VN
 * @since 2024-04-21
 */
public class ContainerWithMostWater {

	/**
	 * Calculates the maximum container area that can be formed by two vertical lines within a rectangle.
	 * 
	 * @param height An array of non-negative integers representing wall heights.
	 * @return The maximum container area that can be formed.
	 */
	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;
		while (left < right) {
			int breadth = right - left;
			int length = Math.min(height[left], height[right]);
			int area = breadth * length;
			maxArea = Math.max(area, maxArea);
			if (height[left] > height[right]) {
				right--;
			} else {
				left++;
			}
		}
		return maxArea;
	}

}
