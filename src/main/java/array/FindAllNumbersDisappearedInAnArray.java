package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
	
    /**
     * Functions find the numbers which are missing from a range of number from 1 to n
     * 
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] occ = new boolean[nums.length];
        for(int i = 0; i < nums.length; i ++) {
            occ[nums[i] - 1] = true;
        }
        for(int j = 0; j < nums.length; j ++) {
            if(!occ[j]) {
                list.add(j + 1);
            }
        }
        return list;
    }

}
