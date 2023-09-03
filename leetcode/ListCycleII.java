public class ListCycleII {
    class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        // ListNode temp = head;
        // ArrayList<ListNode> list = new ArrayList<ListNode>();
        // while(temp!=null)
        // {
        //     list.add(temp);
        //     if(list.contains(temp.next)){
        //         return temp.next;
        //     }
        //     temp = temp.next;
        // }
        ListNode fast = head;
        ListNode slow = head;
        ListNode res = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                while(slow!=res)
                {
                    slow=slow.next;
                    res = res.next;
                }
                return slow;
            }
        }
        return null;
    }

}