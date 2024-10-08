package string;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {

	/**
	 *  Given a string 's', this function will return the string with all the vowels in the string 
	 * reversed, while keeping the consonants in their original order.
 	 *
	 * @param s input string to reverse the vowels.
	 * @return string with the vowels in reverse order.
	 */
	public String reverseVowels(String s) {
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		StringBuilder sb = new StringBuilder(s);
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);
			if (vowels.contains(ch1)) {
				if (vowels.contains(ch2)) {
					sb.setCharAt(i, ch2);
					sb.setCharAt(j, ch1);
					i++;
				}
				j--;
			} else {
				i++;
			}
		}
		return sb.toString();
	}

}
