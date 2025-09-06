package string;

public class ReverseOnlyLetters {
	
    public String reverseOnlyLetters(String s) {
        char[] letters = s.toCharArray();
        int r = letters.length - 1;
        int l = 0;
        while(l < r) {
            if(!Character.isLetter(letters[l])) {
                l++;
            } else if (!Character.isLetter(letters[r])) {
                r--;
            } else {
                char temp = letters[r];
                letters[r] = letters[l];
                letters[l] = temp;
                r--;
                l++;
            }
        }
        return new String(letters);
    }

}
