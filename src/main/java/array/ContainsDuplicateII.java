package array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++) {
            int n = nums[i];
            if(map.containsKey(n)) {
                int idx = map.get(n);
                if(Math.abs(idx - i) <= k) {
                    return true;
                }
                map.put(n, i);
            } else {
                map.put(n, i);
            }
        }
        return false;
        
    }

}
