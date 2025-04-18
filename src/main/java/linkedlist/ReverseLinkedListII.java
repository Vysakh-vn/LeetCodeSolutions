package linkedlist;

public class ReverseLinkedListII {
	
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        int length = right - left + 1;
        int[] list = new int[length];
        ListNode current = head;
        int count = 1;
        while(current != null) {
            if(count >= left && count <= right) {
                list[count - left] = current.val;
            }
            current = current.next;
            count ++;
        }
        int diff = right - left;
        count = 1;
        current = head;
        while(current != null) {
            if(count >= left && count <= right) {
                current.val = list[diff];
                diff --;
            }
            current = current.next;
            count ++;
        }
        return head;
    }

}
