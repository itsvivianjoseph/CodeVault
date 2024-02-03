public class LinkedList {
    class Node {
        int data;
        Node next;
        Node(){
            data = 0;
            next = null;
        }
        Node(int val){
            data = val;
            next = null;
        }
    }

    LinkedList(){
        head = null;
    }
    
    Node head;
    
    public void update(int val,int pos){
        if(head == null) throw new IndexOutOfBoundsException("The list is empty!!!");
        Node curr = head;
        for (int i = 0; i < pos; i++) {
            if(curr == null) throw new IndexOutOfBoundsException("give a valid index!!!");
            curr = curr.next;            
        }
        curr.data = val;
    }
    public void insertAtBegining(int val){
        Node newnode = new Node(val);
        if(head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void insertAtEnd(int val){
        Node newnode = new Node(val);
        if(head == null) throw new IndexOutOfBoundsException("The list is empty!!!");
        Node curr = head;
        while(curr.next != null) curr=curr.next;
        curr.next = newnode; 
    }
    public void oddOrEven(){
        Node fast = head;
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
        }
        if(fast == null) System.out.println("even");
        else System.out.println("odd");
    }
    public void lengthOfList(){
        if(head == null) throw new Error("empty List");
        Node curr = head;
        int length = 0;
        while(curr != null) 
        {
            length++;
            curr = curr.next;
        }
        System.out.println("Length of the List is :"+length);
    }
    public void deleteAtPos(int pos){
        if(head == null) throw new IndexOutOfBoundsException("The list is empty!!!");
        Node curr = head;
        Node prev = curr;
        for(int i=0;i<pos;i++){
            prev = curr;
            curr = curr.next;
            if(curr == null) throw new IndexOutOfBoundsException("Invalid position!!!");
        }
        prev.next = curr.next;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert elements
        linkedList.insertAtBegining(0);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);

        // Display length of the list
        linkedList.lengthOfList();

        // Update an element at a specific position
        linkedList.update(99, 2);

        // Display length of the list after updating
        linkedList.lengthOfList();

        // Determine if the length is odd or even
        linkedList.oddOrEven();

        // Delete an element at a specific position
        linkedList.deleteAtPos(1);

        // Display length of the list after deletion
        linkedList.lengthOfList();
    }


}