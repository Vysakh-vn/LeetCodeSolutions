package array;

import java.util.Arrays;

public class KeyboardRow {

    public String[] findWords(String[] words) {
        int[] keys = initialize();
        int count = 0;
        for(int i = 0; i < words.length; i ++) {
            boolean canBeTyped = true;
            String s = words[i].toLowerCase();
            int row = keys[s.charAt(0) -'a'];
            char c;
            for(int j = 1; j < s.length(); j ++) {
                c = s.charAt(j);
                if(keys[c - 'a'] != row) {
                    canBeTyped = false;
                    break; 
                } 
            }
            if(canBeTyped) {
                words[count] = words[i];
                count ++;
            }
        }
        return Arrays.copyOf(words, count);
    }

    private int[] initialize() {
        int[] keys = new int[26];
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        int row = 1;
        char c = 'a';
        for(int i = 0; i < 26; i ++) {
            if(i == 10) {
                row = 2;
            } else if (i == 19) {
                row = 3;
            }
            if(row == 1) {
                c = row1.charAt(i);
            } else if (row == 2) {
                c = row2.charAt(i - 10);
            } else if (row == 3) {
                c = row3.charAt(i - 19);
            }
            keys[c - 'a'] = row;
        }
        return keys;
    }
	
}
