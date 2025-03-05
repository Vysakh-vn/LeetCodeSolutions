package array;

public class IslandPerimeter {
	
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
