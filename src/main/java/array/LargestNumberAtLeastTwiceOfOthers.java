package array;

public class LargestNumberAtLeastTwiceOfOthers {
	
    public int dominantIndex(int[] nums) {
        int largest = 0;
        int largestIndex = 0;
        int secondLargest = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                largestIndex = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        if((secondLargest * 2) <= largest) return largestIndex;
        return -1;
    }

}
