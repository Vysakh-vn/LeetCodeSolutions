package string;

public class NumberOfSubStringsContainingAllThreeCharacters {

	/**
	 * Counts the number of substrings in the given string that contain at least 
	 * one occurrence of each character 'a', 'b', and 'c'.
	 * 
	 * The function uses a sliding window approach to efficiently find valid substrings.
	 * A dynamic window that expands until all three characters are present and then 
	 * counts the possible valid substrings from that position.
	 * 
	 * @param s The input string consisting of only 'a', 'b', and 'c'.
	 * @return The total count of valid substrings.
	 * 
	 * Time Complexity: O(n) - Each character is processed at most twice (once by right, once by left).
	 * Space Complexity: O(1) - Only a fixed array of size 3 is used for character counts.
	 */
	public int numberOfSubstrings(String s) {
		int[] count = new int[3];
		int left = 0, result = 0;

		for (int right = 0; right < s.length(); right++) {
			count[s.charAt(right) - 'a']++;

			while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
				result += s.length() - right;
				count[s.charAt(left) - 'a']--;
				left++;
			}
		}
		return result;
	}

}
