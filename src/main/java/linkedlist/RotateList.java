package linkedlist;

public class RotateList {
	
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;
        if(k == 0) return head;
        ListNode tail = head;
        int length = 1;
        while(tail.next != null) {
            length ++;
            tail = tail.next;
        }
        int target = length - (k % length);
        tail.next = head;
        ListNode current = head;
        for(int i = 1; i < target; i ++) {
            current = current.next;
        }
        head = current.next;
        current.next = null;
        return head;
    }

}
