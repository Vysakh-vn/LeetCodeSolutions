package string;

public class RansomNote {
	
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqMap = new int[26];
        for(char c : ransomNote.toCharArray()) {
            freqMap[c - 'a'] ++;
        }

        for(char d : magazine.toCharArray()) {
            freqMap[d - 'a'] --;
        }

        for(int i = 0; i < freqMap.length; i ++) {
            if(freqMap[i] > 0) return false;
        }
        return true;
    }

}
