package string;

public class FindWordsThatCanBeFormedByCharacters {
	
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(char c : chars.toCharArray()) {
            freq[c - 'a'] ++;
        }

        int count = 0;
        for(String word : words) {
            int[] freqArr = buildFreqArr(word);
            if(canBeBuild(freqArr, freq)) count += word.length();
        }
        return count;

    }

    private int[] buildFreqArr(String word) {
        int[] freqArr = new int[26];
        for(char c : word.toCharArray()) {
            freqArr[c - 'a'] ++;
        }
        return freqArr;
    }

    private boolean canBeBuild(int[] freqArr, int[] freq) {
            for(int i = 0; i < freqArr.length; i ++) {
                if(freqArr[i] > freq[i]) return false;
            }
            return true;
    }

}
