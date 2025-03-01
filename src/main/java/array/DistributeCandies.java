package array;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	
    public int distributeCandies(int[] candyType) {
        int l = candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int n : candyType) {
            set.add(n);
        }
        if(set.size() < l/2) {
            return set.size();
        } 
        return l / 2;
    }

}
