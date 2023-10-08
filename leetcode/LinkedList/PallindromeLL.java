package LinkedList;

class PallindromLL{ 
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
  public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        // ListNode temp = head;
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // while(temp!=null)
        // {
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // int i=0,j=list.size()-1;
        // while(i<=j)
        // {
        //     if(list.get(i)!=list.get(j)) return false;
        //     i++;
        //     j--;
        // }
        // return true;
        ListNode slow = head;
        ListNode fast = head;
        // find the middle element
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        // if odd no of elements in list
        if(fast!=null && fast.next==null)
        {
            slow = slow.next;
        }
        //reverse the second half of the list
        ListNode prev = null;
        ListNode temp = null;
        while(slow!=null && slow.next!=null)
        {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        if(slow!=null) slow.next=prev;
        // compare the two halfs
        fast = head;
        while(slow!=null && fast!=null){
            if(slow.val!=fast.val) return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }   
}