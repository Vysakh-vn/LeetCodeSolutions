package linkedlist;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode previous = null;
        if(head == null) return null;    
        while(current != null) {
            if(current.val == val) {
                if(previous != null) {
                    previous.next = current.next;
                    current = current.next;
                } else {
                    previous = current;
                    current = current.next;
                    previous = null;
                    head = current;
                }
            } else {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

}
