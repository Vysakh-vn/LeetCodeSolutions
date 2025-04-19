package linkedlist;

public class SwapNodesInPairs {
	
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode current = head;
        ListNode prev = null;
        int count = 1;
        while(current != null) {
            if(count == 2) {
                int val = prev.val;
                prev.val = current.val;
                current.val = val;
                count = 0;
            }
            prev = current;
            current = current.next;
            count ++;
        }
        return head;
    }

}
