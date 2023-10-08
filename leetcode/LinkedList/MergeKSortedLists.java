package LinkedList;
public class MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode current = res;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }
        
        if (temp1 != null) {
            current.next = temp1;
        }
        
        if (temp2 != null) {
            current.next = temp2;
        }
        
        return res.next;
    }

    static ListNode mergeKLists(ListNode[] lists) {
        for(int i=1;i<lists.length;i++){
            mergeTwoLists(lists[0],lists[i]);
        }
        return lists[0];
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
    
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
    
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
    
        ListNode[] lists = {l1, l2, l3};
    
        ListNode mergedList = mergeKLists(lists);
    
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}