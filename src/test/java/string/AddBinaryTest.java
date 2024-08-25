package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AddBinaryTest {

	@ParameterizedTest
	@CsvSource({
		"11, 1, 100",
		"1010, 1011, 10101"
	})
    public void addBinaryTest(String a, String b, String expected) {
        String actual = new AddBinary().addBinary(a, b);
        assertEquals(expected, actual);
    }
	
}
