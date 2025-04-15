package linkedlist;

public class RemoveNthNodeFromEndOfLIst {
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        if(head == null) return null;
        for(int i = 0; i < n; i ++) {
            fast = fast.next;
        }

        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(prev == null) {
            head = head.next;
            slow = null;
        } 
        else prev.next = slow.next;
        return head;
    }

}
