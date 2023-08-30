public class LLlength {
    Node head;
    public class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data = val;
            next = null;
        }    
    }
    LLlength()
    {
        head = null;
    }
    public void addAtBegining(int val)
    {
        Node newnode = new Node(val);
        if(head==null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public int countLength()
    {
        if(head==null) {
            System.out.println("empty list");
            return 0;
        }
        Node temp = head;
        int count=0;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        return (count+1)%2==0 ? 1 : 0;
    }
    public static void main(String[] args) {
        LLlength obj = new LLlength();
        obj.addAtBegining(0);
        obj.addAtBegining(1);
        obj.addAtBegining(2);
        obj.addAtBegining(3);
        System.out.println(obj.countLength());
    }
}