package linkedlist;

public class RemoveLinkedListElements {

	/**
	 * Removes all nodes from a singly linked list that have a specific value.
	 *
	 * This method traverses the given linked list and removes all nodes whose value
	 * equals the specified target value. The method handles cases where the nodes
	 * to be removed include the head of the list. It returns the new head of the
	 * modified list after removals.
	 *
	 * @param head The head of the singly linked list.
	 * @param val The value to be removed from the list.
	 * @return The head of the list after removing all nodes with the given value.
	 */
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
