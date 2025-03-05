package recursion;

public class CountTotalNumberOfColouredCells {
	
    public long coloredCells(int n) {
        if(n == 1) {
            return 1;
        }
        return 4 * (n - 1) + coloredCells(n - 1);
    }

}
