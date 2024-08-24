package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExcelSheetColumnNumberTest {
	
	@ParameterizedTest
	@CsvSource({
		"A, 1",
		"AB, 28",
		"ZY, 701"
	})
	public void titleToNumberTest(String columnTitle, int expected) {
		int actual = new ExcelSheetColumnNumber().titleToNumber(columnTitle);
		assertEquals(expected, actual);
	}

}
