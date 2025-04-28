package string;

public class MinimumNumberOfChairsInAWaitingRoom {
	
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
