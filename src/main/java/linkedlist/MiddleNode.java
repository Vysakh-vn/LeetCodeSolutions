package linkedlist;

public class MiddleNode {
	
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null) {
            if(fast.next.next == null) {
                fast = fast.next;
            } else {
                fast = fast.next.next;
            }
            slow = slow.next;
        }
        return slow;
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
