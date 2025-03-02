package array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaxNumber {
	
	/**
	 * Finds the third maximum number in an array.
	 *
	 * <p>This method returns the third distinct maximum number in the given array.
	 * If the third maximum does not exist, it returns the maximum number.</p>
	 *
	 * <p>Approach:
	 * <ul>
	 *     <li>Uses a HashSet to store unique elements from the array.</li>
	 *     <li>If there are fewer than 3 distinct numbers, returns the maximum number.</li>
	 *     <li>Otherwise, removes the two largest numbers and returns the third largest.</li>
	 * </ul>
	 * </p>
	 *
	 * @param nums An array of integers.
	 * @return The third distinct maximum number if it exists; otherwise, the maximum number.
	 */
	public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) s.add(n);
        
        if (s.size() < 3) return Collections.max(s);
        
        s.remove(Collections.max(s));
        s.remove(Collections.max(s));
        
        return Collections.max(s);
	}

}
