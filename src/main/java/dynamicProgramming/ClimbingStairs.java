package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

	public Map<Integer,Integer> stepsTable = new HashMap<>();	
	

	public int climbStairs(int n) {
		if(n == 1 || n == 0) {
			return 1;
		} else {
			int steps = stepsTable.getOrDefault(n, 0);
			if(steps != 0) {
				return steps; 
			} else {
				steps = climbStairs(n - 1) + climbStairs(n - 2);
				stepsTable.put(n, steps);
				return steps;
			}
		}
    }
	
}
