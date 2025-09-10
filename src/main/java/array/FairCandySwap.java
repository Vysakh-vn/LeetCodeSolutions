package array;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
	
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> bobLookup = new HashSet<>();
		int[] answer = new int[2];
		
		int aliceTotalCandy = 0;
		int bobTotalCandy = 0;
		
		for(int i = 0; i < bobSizes.length; i ++) {
			bobLookup.add(bobSizes[i]);
			bobTotalCandy += bobSizes[i];
		}
		
		for(int n : aliceSizes) {
			aliceTotalCandy += n;
		}
		
		
		int requiredCandyCount = (aliceTotalCandy + bobTotalCandy) / 2;
		
		for(int j = 0; j < aliceSizes.length; j ++) {
			int n = aliceSizes[j];
			int requiredCandies = requiredCandyCount - (aliceTotalCandy - n);
			if(bobLookup.contains(requiredCandies)) {
				answer[0] = n;
				answer[1] = requiredCandies;
				break;
			}
		}
		return answer;
    }

}
