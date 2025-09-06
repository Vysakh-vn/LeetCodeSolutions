package string;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
	
	public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> morseCode = Map.ofEntries(
                Map.entry('a', ".-"),
                Map.entry('b', "-..."),
                Map.entry('c', "-.-."),
                Map.entry('d', "-.."),
                Map.entry('e', "."),
                Map.entry('f', "..-."),
                Map.entry('g', "--."),
                Map.entry('h', "...."),
                Map.entry('i', ".."),
                Map.entry('j', ".---"),
                Map.entry('k', "-.-"),
                Map.entry('l', ".-.."),
                Map.entry('m', "--"),
                Map.entry('n', "-."),
                Map.entry('o', "---"),
                Map.entry('p', ".--."),
                Map.entry('q', "--.-"),
                Map.entry('r', ".-."),
                Map.entry('s', "..."),
                Map.entry('t', "-"),
                Map.entry('u', "..-"),
                Map.entry('v', "...-"),
                Map.entry('w', ".--"),
                Map.entry('x', "-..-"),
                Map.entry('y', "-.--"),
                Map.entry('z', "--..")
        );

        Set<String> set = new HashSet<>();
        for(int i = 0; i < words.length; i ++) {
            String s = words[i];
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < s.length(); j ++) {
                char c = s.charAt(j);
                sb.append(morseCode.get(c));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
