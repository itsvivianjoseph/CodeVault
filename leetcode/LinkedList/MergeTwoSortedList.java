package LinkedList;
class MergeTwoSortedList {

    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null) return list2;
		if(list2 == null) return list1;

        ListNode res = new ListNode();
        ListNode current = res;

        ListNode one = list1;
        ListNode two = list2;
        
        while (one != null && two != null) 
        {
            if (one.val <= two.val) {
                current.next = one;
                one = one.next;
            } else {
                current.next = two;
                two = two.next;
            }
            current = current.next;
        }
        
        if (one != null) {
            current.next = one;
        }

        if (two != null) {
            current.next = two;
        }
        return res.next; 
    }
}