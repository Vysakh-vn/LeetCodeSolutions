package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalsTriangle {
	
	Map<Integer, List<Integer>> memory = new HashMap<>();
	
	
	/**
	 * Creates a Pascal's triangle.
	 * 
	 * @param numRows Number of rows in the generated triangle.
	 * @return
	 */
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		generateRow(numRows);
		for(int i = 1; i <= numRows; i ++) {
			list.add(memory.get(i));
		}
		return list;
	}
	
	public List<Integer> generateRow(int numRows) {
		if(numRows == 1) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			memory.put(1, list);
			return list;
		}
		List<Integer> previousRow = generateRow(numRows - 1);
		List<Integer> row = new ArrayList<>();
		for(int i = 0; i < numRows; i ++) {
			if(i == 0) {
				row.add(1);
			} else if (i == numRows - 1) {
				row.add(1);
			} else {
				int value = previousRow.get(i - 1) + previousRow.get(i);
				row.add(value);
			}
			
		}
		memory.put(numRows, row);
		return row;
	}

}
