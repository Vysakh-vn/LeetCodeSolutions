package linkedlist;

public class DeleteNodeInALinkedList {
	
    /**
     * Deletes a node from the linked list without having head pointer.
     * 
     * @param node
     */
    public void deleteNode(ListNode node) {
        int val = node.val;
        ListNode prev = null;
        while(node.next != null) {
            node.val = node.next.val;
            node.next.val = val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }

}
