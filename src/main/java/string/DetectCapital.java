package string;

public class DetectCapital {
	
    public boolean detectCapitalUse(String word) {
        int length = word.length();
        if(length == 1) return true;
        char c = word.charAt(1);
        if(Character.isLowerCase(c)) {
            return isLowerCase(word.substring(1));
        } else {
            return isUpperCase(word);
        }
    }

    private boolean isLowerCase(String s) {
        for(int i = 0; i < s.length(); i ++) {
            int val = s.charAt(i) - 'a';
            if(val < 0) return false;
        }
        return true;
    }

    private boolean isUpperCase(String s) {
        for(int i = 0; i < s.length(); i ++) {
            int val = s.charAt(i) - 'a';
            if(val >= 0) return false;
        }
        return true;
    }

}
