package array;

public class CalculateScoreAfterPerformingInstructions {
	
	/**
	 * Calculates the score based on a sequence of instructions and corresponding values.
	 * 
	 * The method iterates through the instructions starting from index 0. At each index:
	 * - If the instruction is "add", it adds the corresponding value to the score and moves to the next index.
	 * - Otherwise, it jumps by the value at that index (i.e., performs a relative jump).
	 * 
	 * The traversal continues until it either:
	 * - Exits the bounds of the array, or
	 * - Encounters an index that has already been visited (to prevent infinite loops).
	 * 
	 * @param instructions An array of strings representing instructions ("add" or a jump).
	 * @param values       An array of integers representing values associated with each instruction.
	 * @return The accumulated score before the traversal ends or a cycle is detected.
	 */
    public long calculateScore(String[] instructions, int[] values) {
        int length = values.length;
        long score = 0;
        boolean[] done = new boolean[length];
        int i = 0;
        while(i >= 0 && i < length) {
            if(done[i]) return score;
            done[i] = true;
            String instruction = instructions[i];
            if(instruction.equals("add")) {
                score = score + values[i];
                i ++;
            } else {
                i = i + values[i];
            }
        }
        return score;
    }

}
