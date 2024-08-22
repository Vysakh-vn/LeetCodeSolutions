package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanToIntTest {
	
	@ParameterizedTest
	@CsvSource({
		"I, 1",
		"V, 5",
		"VXX, 15"
	})
	public void romanToIntTest(String roman, int expected) {
		int actual = new RomanToInteger().romanToInt(roman);
		assertEquals(expected, actual);
	}

}
