package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
	
    public String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> map = new HashMap<>();
        for(String word : s1.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(String word : s2.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> ans = new ArrayList<>();
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
        	if(entry.getValue() == 1) ans.add(entry.getKey());
        }

        return ans.toArray(new String[ans.size()]);
    }

}
