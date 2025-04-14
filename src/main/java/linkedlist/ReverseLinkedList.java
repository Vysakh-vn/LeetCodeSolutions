package linkedlist;

public class ReverseLinkedList {

    /**
     * Function to reverse a linked list
     * 
     * @param head
     * @return head of reversed linked list
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
	
}
