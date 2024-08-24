package string;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
	
	private static Map<Character, Integer> letterMap = new HashMap<>();
	
	static {
		letterMap.put('A', 1);
		letterMap.put('B', 2);
		letterMap.put('C', 3);
		letterMap.put('D', 4);
		letterMap.put('E', 5);
		letterMap.put('F', 6);
		letterMap.put('G', 7);
		letterMap.put('H', 8);
		letterMap.put('I', 9);
		letterMap.put('J', 10);
		letterMap.put('K', 11);
		letterMap.put('L', 12);
		letterMap.put('M', 13);
		letterMap.put('N', 14);
		letterMap.put('O', 15);
		letterMap.put('P', 16);
		letterMap.put('Q', 17);
		letterMap.put('R', 18);
		letterMap.put('S', 19);
		letterMap.put('T', 20);
		letterMap.put('U', 21);
		letterMap.put('V', 22);
		letterMap.put('W', 23);
		letterMap.put('X', 24);
		letterMap.put('Y', 25);
		letterMap.put('Z', 26);
	}
	
    /**
     * This function returns the column number corresponding to the column title as appears in Excel sheet
     * @param columnTitle
     * @return columnNumber
     */
    public int titleToNumber(String columnTitle) {
    	char[] chars = columnTitle.toCharArray();
    	int length = chars.length - 1;
    	int colNo = 0;
    	for(int i = 0; i <= length; i++) {
    		colNo += letterMap.get(chars[i]) * Math.pow(26, length- i);
    	}
    	return colNo;
    }
}
