package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfEquivalentDominoPairs {
	
    public int numEquivDominoPairs(int[][] dominoes) {
        String[] hashArray = new String[dominoes.length];
        Map<String, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < dominoes.length; i ++) {
            int[] row = dominoes[i];
            Arrays.sort(row);
            String hash = row[0] + " : " + row[1];
            hashArray[i] = hash;
            if(map.containsKey(hash)) {
                map.get(hash).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(hash, list);
            }
        }

        int count = 0;
        for(int j = 0; j < dominoes.length; j ++) {
            List<Integer> list = map.get(hashArray[j]);
            for(int n : list) {
                if(n > j) count ++;
            } 
        }
        return count;
    }

}
