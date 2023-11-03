package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesfromSortedListII {
        class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    ListNode(){}
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ListNode current = head;

        while (current != null) {
            int val = current.val;
            frequencyMap.put(val, frequencyMap.getOrDefault(val, 0) + 1);
            current = current.next;
        }

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        current = head;

        while (current != null) {
            int val = current.val;
            if (frequencyMap.get(val) == 1) {
                tail.next = new ListNode(val);
                tail = tail.next;
            }
            current = current.next;
        }

        return dummy.next;
    }

}
