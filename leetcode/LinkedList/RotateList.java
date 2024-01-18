package LinkedList;

public class RotateList {
    class ListNode {
        int val;
        ListNode next;
        
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;

        int len = 1;
        ListNode tail = head;
        while(tail.next != null){ 
            len++;
            tail=tail.next;
        }

        k = k % len;
        if(k == 0) return head;

        ListNode newTail = head;
        for(int i=0;i<len-k-1;i++) newTail = newTail.next;

        ListNode newHead = newTail.next;
        newTail.next = null;

        tail.next = head;

        return newHead;
    }
}
