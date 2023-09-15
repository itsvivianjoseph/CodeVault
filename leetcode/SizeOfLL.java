public class SizeOfLL {
    class ListNode {
        int val;
        ListNode next;
        
        public ListNode(int val) {
            this.val = val;
        }
    }
    
    static int findSizeOfLinkedList(ListNode head) {
        if (head == null) {
            return 0; // Handle the case of an empty list.
        }
    
        ListNode slow = head;
        ListNode fast = head;
        int size = 0;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by one step
            fast = fast.next.next;  // Move fast by two steps
            size += 2;              // Increment the size by two steps
        }
    
        // If fast is not null, it means the list has an odd number of elements, so increment size by 1.
        if (fast != null) {
            size++;
        }
    
        return size;
    }

    public static void main(String[] args) {
        SizeOfLL SizeOfLL = new SizeOfLL(); // Create an instance of SizeOfLL
        SizeOfLL.ListNode head = SizeOfLL.new ListNode(1); // Create an instance of SizeOfLL.ListNode
        
        // Create the linked list
        head.next = SizeOfLL.new ListNode(2);          // Use SizeOfLL.ListNode when creating ListNode instances
        head.next.next = SizeOfLL.new ListNode(3);     // Use SizeOfLL.ListNode when creating ListNode instances
        head.next.next.next = SizeOfLL.new ListNode(4); // Use SizeOfLL.ListNode when creating ListNode instances
        // head.next.next.next.next = SizeOfLL.new ListNode(5); // Use SizeOfLL.ListNode when creating ListNode instances
        
        // Find the size of the linked list
        int size = findSizeOfLinkedList(head);
        
        System.out.println("Size of the linked list: " + size); // Output: Size of the linked list: 4
        
    }    
}
