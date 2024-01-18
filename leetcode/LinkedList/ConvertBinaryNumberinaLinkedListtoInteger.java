package LinkedList;

public class ConvertBinaryNumberinaLinkedListtoInteger {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public int getDecimalValue(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

        int decimal = 0;
        int pow = 0;
        while (head != null) {
            decimal += head.val * Math.pow(2, pow++);
            head = head.next;
        }

        return decimal;
    }

}
