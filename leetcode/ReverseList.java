class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nxt;
        while(current!=null)
        {
            nxt = current.next;
            current.next = prev; //reverse the linkedlidt
            prev = current; 
            current = nxt;
        }
        head=prev;
        return head;
    }
}