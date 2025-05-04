package array;

import java.util.Arrays;

public class MaximumProductOfTwoDigits {
	
    /**
     * Function finds the maximum product of any two digits in the provided number n
     * 
     * @param n
     * @return
     */
    public int maxProduct(int n) {
        
        int divisor = 10;
        int length = 2;
        while(divisor < n) {
            if((divisor * 10) < n) {
                divisor = divisor * 10;
                length ++;
            } else {
                break;
            }
        }
        
        int[] digits = new int[length];
        int count = 0;
        while(count < length) {
            int digit = n / divisor;
            digits[count] = digit;
            count ++;
            n = n % divisor;
            divisor = divisor / 10;
        }
        
        Arrays.sort(digits);
        return digits[length - 1] * digits[length - 2];
        
    }

}
