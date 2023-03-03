public class circularLL <T>{
    Node last;
    class Node
    {
        T data;
        Node next;
        Node(T val)
        {
            this.data=val;
            this.next=null;
        } 
    }
    circularLL(){
        last = null;
    }
    public void insertAtBeginning(T val){
        Node newnode = new Node(val);
        if(last==null){
            newnode.next=newnode;
            last=newnode;
        }
        else{
            newnode.next=last.next;
            last.next=newnode;
        }
    } 
    public void insertAtEnd(T val){
        Node newnode = new Node(val);
        if(last==null){
            newnode.next=newnode;
        }
        else{
            newnode.next=last.next;
            last.next=newnode;
        }
        last=newnode;
    } 
    public void display(){
        if(last==null){
            System.out.println("empty list!");
            return;
        }
        else
        {
            Node temp = last.next;
            do
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }while(temp!=last.next);
        }
    }
    public T deleteatBegining()
    {
        Node temp = last.next;
        if(last==null)
        {
            throw new IndexOutOfBoundsException("the list is empty");
        }
        if(last.next==last)
        {
            last=null;
        }
        else
        {
            last.next=last.next.next;
        }
        return temp.data;
    }
    public void deleteAtEnd()
    {
        if(last==null)
        {
            throw new IndexOutOfBoundsException("the list is empty");
        }
        if(last.next==last)
        {
            last=null;
        }
        else
        {
            Node temp=last.next;
            while(temp.next!=last)
            {
                temp=temp.next;
            }
            temp.next=last.next;
            last=temp;
        }
    }
    public void deleteByValue(T val)
    {
        Node temp=last.next;
        Node sectemp=temp;
        while(temp.data!=val)
        {
            sectemp=temp;
            temp=temp.next;
            //if(temp==last) break;
        }
        sectemp.next=temp.next;        
    }
    public static void main(String[] args) {
        circularLL<Integer> list = new circularLL<Integer>();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
    }
}
