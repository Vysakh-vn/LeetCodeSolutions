package linkedlist;

public class RemoveDuplicatesFromSortedList {
	
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        int[] lookup = new int[201];
        ListNode current = head;
        ListNode prev = null;
        while(current != null) {
            int val = current.val;
            if(lookup[val + 100] == 0) {
                lookup[val + 100] ++;
                prev = current;
                current = current.next;
            } else {
                ListNode node = current;
                prev.next = current.next;
                current = current.next;
                node.next = null; 
            }
        }
        return head;
    }

}
