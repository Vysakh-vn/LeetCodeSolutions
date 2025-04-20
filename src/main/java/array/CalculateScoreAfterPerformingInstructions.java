package array;

public class CalculateScoreAfterPerformingInstructions {
	
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
