package linkedlist;

public class DeleteNodeInALinkedList {
	
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
