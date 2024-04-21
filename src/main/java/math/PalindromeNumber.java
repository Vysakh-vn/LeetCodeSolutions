package math;

/**
 * @author Vysakh VN
 * @since 2024-04-21
 */
public class PalindromeNumber {

	
	/**
	 * Checks if a given integer is a palindrome.
	 * 
	 * @param x The integer to check for palindromicity.
	 * @return True if the number is a palindrome, false otherwise.
	 */
	public boolean isPalindrome(int x) {

		int duplicate = x;
		int reverse = 0;
		while (x > 0) {
			int reminder = x % 10;
			x = x / 10;
			reverse = reverse * 10 + reminder;
		}
		if (reverse == duplicate) {
			return true;
		} else {
			return false;
		}

	}

}
