package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExcelSheetColumnTitleTest {
	
	@ParameterizedTest
	@CsvSource({
		"1, A",
		"28, AB",
		"701, ZY"
	})
	public void convertToTitle(int columnNumber, String expectedTitle) {
		String actualTitle = new ExcelSheetColumnTitle().convertToTitle(columnNumber);
		assertEquals(expectedTitle, actualTitle);
	}

}
