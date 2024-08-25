package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseWordsInAStringTest {
	
	@ParameterizedTest
	@CsvSource({
		"'the sky is blue', 'blue is sky the'",
		"'  hello world  ', 'world hello'",
		"'a good   example', 'example good a'"
	})
    public void reverseWordsTest(String s, String expected) {
        String actual = new ReverseWordsInAString().reverseWords(s);
        assertEquals(expected, actual);
    }

}
