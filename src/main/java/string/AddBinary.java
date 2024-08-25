package string;

public class AddBinary {

	/**
	 * This function return sum as a binary string for the input strings a and b.
	 * 
	 * @param a
	 * @param b
	 * @return sum
	 */
	public String addBinary(String a, String b) {
		int carry = 0;
		int i = a.length() - 1;
		int j = b.length() - 1;
		StringBuilder c = new StringBuilder();
		while (i >= 0 || j >= 0 || carry == 1) {
			if (i >= 0) {
				carry += a.charAt(i) - '0';
				i--;
			}
			if (j >= 0) {
				carry += b.charAt(j) - '0';
				j--;
			}
			c.append(carry % 2);
			carry /= 2;
		}
		return c.reverse().toString();
	}

}