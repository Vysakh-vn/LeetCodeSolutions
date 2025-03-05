package recursion;

public class CountTotalNumberOfColouredCells {
	
	/**
	 * Calculates the total number of colored cells in an expanding pattern where
	 * each step increases the number of colored cells symmetrically.
	 *
	 * The pattern follows a recursive formula:
	 * - Base case: When n = 1, there is only 1 colored cell.
	 * - Recursive case: At each step, 4 additional cells are added per side 
	 *   to the previous count.
	 *
	 * This function computes the total number of colored cells using recursion.
	 *
	 * @param n The step number in the pattern (1-based index).
	 * @return The total number of colored cells at step n.
	 */
    public long coloredCells(int n) {
        if(n == 1) {
            return 1;
        }
        return 4 * (n - 1) + coloredCells(n - 1);
    }

}
