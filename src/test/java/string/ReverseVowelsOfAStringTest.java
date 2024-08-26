package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseVowelsOfAStringTest {
	
	@ParameterizedTest
	@CsvSource({
		"hello, holle",
		"leetcode, leotcede"
	})
	public void reverseVowels(String s, String expected) {
		String actual = new ReverseVowelsOfAString().reverseVowels(s);
		assertEquals(expected, actual);
	}

}
