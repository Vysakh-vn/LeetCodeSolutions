package array;

public class PlusOne {
	
    public int[] plusOne(int[] digits) {
        int length = digits.length;
    	int sum = digits[length - 1] + 1;
    	int carry = 0;
    	if(sum > 9) {
    		carry = 1;
    		digits[length - 1] = 0;
    	} else {
    		carry = 0;
    		digits[length - 1] = sum;
    		return digits;
    	}
    	
    	int index = length - 2;
    	while(carry == 1) {
    		if(index == -1) {
    			return createNewArray(digits);
    		}
    		int n = digits[index];
    		sum = n + carry;
    		if(sum > 9) {
    			digits[index] = 0;
    			index --;
    		} else {
    			carry = 0;
    			digits[index] = sum;
    		}
    	}
    	return digits;
    }

    public int[] createNewArray(int[] digits) {
    	int[] newArray = new int[digits.length + 1];
    	for(int i = 1; i < newArray.length; i++) {
    		newArray[i] = digits[ i - 1];
    	}
    	newArray[0] = 1;
    	return newArray;
    }
	
}
