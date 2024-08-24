package string;

public class ExcelSheetColumnTitle {
	
	/**
	 * This function returns its corresponding column title on input of column number as it appears in Excel sheet.
	 *  
	 * @param columnNumber
	 * @return columnTitle
	 */
	public String convertToTitle(int columnNumber) {
		StringBuilder title = new StringBuilder();
		while(columnNumber != 0) {
			char letter;
			if((columnNumber % 26) == 0) {
				letter = 'Z';
				columnNumber -= 26;
			} else {
				letter = (char)((columnNumber % 26) + 64);
			}
			title.append(letter);
			columnNumber = columnNumber/26;
		}
		return title.reverse().toString();
	}

}
