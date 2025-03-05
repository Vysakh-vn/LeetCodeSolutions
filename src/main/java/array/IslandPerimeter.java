package array;

public class IslandPerimeter {
	
	/**
	 * Calculates the perimeter of an island in a grid.
	 *
	 * The grid consists of 0s (water) and 1s (land). The island is formed by 
	 * connected 1s (land cells) with no diagonal connections.
	 * The perimeter is determined by counting the edges of land cells that 
	 * are adjacent to water or the grid boundary.
	 *
	 * Algorithm:
	 * - Iterate through each cell in the grid.
	 * - If the cell is land (1), check its four possible edges:
	 *   - Top: If it is at the top boundary or the cell above is water, add 1 to the perimeter.
	 *   - Bottom: If it is at the bottom boundary or the cell below is water, add 1 to the perimeter.
	 *   - Left: If it is at the left boundary or the cell to the left is water, add 1 to the perimeter.
	 *   - Right: If it is at the right boundary or the cell to the right is water, add 1 to the perimeter.
	 * - Sum up all the contributions to get the total perimeter.
	 *
	 * @param grid 2D array representing the island map (1 = land, 0 = water).
	 * @return The total perimeter of the island.
	 */
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sum = 0;
        for(int i = 0; i < row; i ++) {
            for(int j = 0; j < col; j ++) {
                if(grid[i][j] == 0) {
                    continue;
                } else {
                    if(i == 0 || grid[i - 1][j] == 0) { // top
                        sum ++;
                    }
                    if(i + 1 == row || grid[i + 1][j] == 0) { // bottom
                        sum ++;
                    }
                    if(j == 0 || grid[i][j - 1] == 0) { // left
                        sum ++;
                    }
                    if(j+1 == col || grid[i][j + 1] == 0) { // right
                        sum ++;
                    }
                }
            }
        }
        return sum;
    }

}
