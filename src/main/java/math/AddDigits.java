package math;

public class AddDigits {
	
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
