package array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
    /**
     * Function returns a string array answer (1-indexed) where:
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     * 
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(); 
        for(int i = 1; i <= n; i ++) {
            if(i%3==0 && i%5==0) list.add("FizzBuzz");
            else if (i%3==0) list.add("Fizz");
            else if (i%5==0) list.add("Buzz");
            else list.add(Integer.toString(i));
        }
        return list;
    }

}
