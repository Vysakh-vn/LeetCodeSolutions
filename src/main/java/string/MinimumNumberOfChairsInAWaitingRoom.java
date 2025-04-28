package string;

public class MinimumNumberOfChairsInAWaitingRoom {
	
    /**
     * Calculates the minimum number of chairs needed so that a chair is available for every person who enters the waiting room given that it is initially empty.
     * 
     * @param s
     * @return
     */
    public int minimumChairs(String s) {
        int chair = 0;
        int occupied = 0;
        char[] c = s.toCharArray();
        for(char ca : c) {
            if(ca == 'E') {
                occupied ++;
                if(chair < occupied) chair ++;
            } else occupied --;
        }
        return chair;
    }

}
