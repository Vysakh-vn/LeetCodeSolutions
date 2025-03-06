package array;

public class FindMissingAndRepeatedValues {
	
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] result = new int[2];
        boolean[] check = new boolean[n * n];
        int sum = 0;
        int actual = 0;
        int duplicate = 0;
        int count = 0;
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                int value = grid[i][j];
                if(!check[value - 1]) {
                    check[value - 1] = true;
                    actual += value;
                } else {
                    duplicate = value;
                }
                count ++;
                sum += count;
            }
        }
        result[0] = duplicate;
        result[1] = sum - actual;
        return result;
    }

}
