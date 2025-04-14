package linkedlist;

public class ReverseLinkedList {

    /**
     * Function to reverse a linked list with O(1) space and O(n) time complexity
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
