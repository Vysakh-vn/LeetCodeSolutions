package string;

public class ValidAnagram {
	
    /**
     * Function that compares a source and target string to check it they are anagrams.
     * 
     * @param s source string
     * @param t target string to compare
     * @return
     */
    public boolean isAnagram(String s, String t) {
        String sortedSource = quickSort(s);
        String sortedTarget = quickSort(t);
        return sortedSource.equals(sortedTarget);
    }

    public String quickSort(String str) {
        if(str.length() <= 1) {
            return str;
        }

        char pivot = str.charAt(0);
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for(int i = 1; i < str.length(); i ++) {
            char c = str.charAt(i);
            if(c <= pivot) {
                left.append(c);
            } else {
                right.append(c);
            }
        }

        String leftStr = quickSort(left.toString());
        String rightStr = quickSort(right.toString());

        StringBuilder sorted = new StringBuilder();
        sorted.append(leftStr).append(pivot).append(rightStr);

        return sorted.toString(); 
    }

}
