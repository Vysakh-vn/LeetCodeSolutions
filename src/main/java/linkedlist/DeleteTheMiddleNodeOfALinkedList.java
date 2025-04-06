package linkedlist;

public class DeleteTheMiddleNodeOfALinkedList {
	
    public ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        ListNode middle = head;
        ListNode previous = null;
        int count = 0;
        if(head == null || head.next == null) return null;
        while(current != null) {
            count ++;
            current = current.next;
            if(count == 2) {
                previous = middle;
                middle = middle.next;
                count = 0;
            }
        }
        if(previous != null) {
            previous.next = middle.next;
        }
        return head;
    }

}
