package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LengthOfLastWordTest {
	
	@ParameterizedTest
	@CsvSource({
		"Hello word, 4",
		"Hello word , 4",
		"'', 0"
	})
	public void lengthOfLastWordTest(String sentence, int expectedLength) {
		int actualLength = new LengthOfLastWord().getLengthOfLastWord(sentence);
		assertEquals(expectedLength, actualLength);
	}

}
