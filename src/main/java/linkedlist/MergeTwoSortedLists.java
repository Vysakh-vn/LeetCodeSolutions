package linkedlist;

public class MergeTwoSortedLists {
	
	
	/**
	 * Merges two sorted linked lists into a single sorted linked list.
	 * 
	 * This function takes two sorted linked lists (list1 and list2) and merges them
	 * into a new sorted linked list by adjusting the `next` pointers of the nodes.
	 * The function does not create new nodes but instead reuses the existing nodes.
	 *
	 * @param list1 The first sorted linked list.
	 * @param list2 The second sorted linked list.
	 * @return The head of the merged sorted linked list.
	 */
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		ListNode head, current;

		if (list1.val < list2.val) {
			head = list1;
			list1 = list1.next;
		} else {
			head = list2;
			list2 = list2.next;
		}

		current = head;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}

		if (list1 != null)
			current.next = list1;
		if (list2 != null)
			current.next = list2;

		return head;
	}
	

	static class ListNode {
	 int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


}
