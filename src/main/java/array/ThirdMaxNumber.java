package array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaxNumber {
	
	public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) s.add(n);
        
        if (s.size() < 3) return Collections.max(s);
        
        s.remove(Collections.max(s));
        s.remove(Collections.max(s));
        
        return Collections.max(s);
	}

}
