package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
	
	
    /**
     * Function to check if the given linked list is Palindrome.
     * 
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        List<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current);
            current = current.next;
        }

        for(int i = 0, j = list.size() - 1; i < j; i ++, j --) {
            if(list.get(i).val != list.get(j).val) {
                return false;
            }
        }
        return true;
    }

}
