package string;

public class NumberOfSegmentsInAString {
	
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        String[] words = s.split(" ");
        int count = 0;
        for(String str : words) {
            if(str.trim().length() > 0) count ++;
        }
        return count;
    }

}
