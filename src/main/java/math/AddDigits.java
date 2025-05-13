package math;

public class AddDigits {
	
    /**
     * Repeatedly adds the digits of a number until the result is a single-digit number.
     * 
     * @param num
     * @return
     */
    public int addDigits(int num) {
        if(num < 10) return num;
        while(true) {
         String s = Integer.toString(num);
         num = sumDigit(s.toCharArray());
         if(num < 10) return num;
        }
    }

    private int sumDigit(char[] arr) {
        int sum = 0;
        for(char c : arr) {
            sum += c - '0';
        }
        return sum;
    }

}
