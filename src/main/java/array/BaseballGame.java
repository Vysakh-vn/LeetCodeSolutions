package array;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
	
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for(String operation : operations) {
            if(operation.equals("+")) {
                int size = list.size() - 1;
                int sum = list.get(size) + list.get(size - 1);
                list.add(sum);
            } else if (operation.equals("D")) {
                int value = list.get(list.size() - 1) * 2;
                list.add(value);
            } else if (operation.equals("C")) {
                list.remove(list.size() - 1);
            } else {
                int num = Integer.parseInt(operation);
                list.add(num);
            }
        }

        int output = 0;
        for(int n : list) {
            output += n;
        }
        return output;
    }

}
