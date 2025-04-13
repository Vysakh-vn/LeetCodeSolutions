package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        List<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current);
            current = current.next;
        }
        ListNode reverse = list.get(list.size() - 1);
        ListNode reverseCurrent = reverse;
        list.get(0).next = null;
        for(int i = list.size() - 2; i >= 0; i --) {
            reverseCurrent.next = list.get(i);
            reverseCurrent = reverseCurrent.next;
        }
        return reverse;
    }
	
}
