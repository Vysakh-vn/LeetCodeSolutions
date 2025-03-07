package array;

import java.util.Arrays;

public class ClosestPrimeNumberInRange {

	
    /**
     * Finds the closest prime number pair in the given range.
     * 
     * @param left
     * @param right
     * @return
     */
    public int[] closestPrimes(int left, int right) {
        int[] temp = new int[right - left];
        int count = 0;
        for(int i = left; i <= right; i ++) {
            if(isPrime(i)) {
                temp[count] = i;
                count ++;
            }
        }
        int[] primes = Arrays.copyOf(temp, count);
        int[] result = new int[2];
        if(primes.length < 2) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        int leastDiff = primes[1] - primes[0];
        result[0] = primes[0];
        result[1] = primes[1];
        for(int j = 1; j < primes.length - 1; j ++) {
            int diff = primes[j + 1] - primes[j];
            if(diff < leastDiff) {
                result[0] = primes[j];
                result[1] = primes[j + 1];
                leastDiff = diff;
            }
        }
        return result;
    }

    private boolean isPrime(int n) {

        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
}
