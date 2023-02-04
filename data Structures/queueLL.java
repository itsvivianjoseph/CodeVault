public class queueLL {
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    node front,rear;
    queueLL(){
        front=null;
        rear=null;
    }
    public void enque(int val){
        node newnode = new node(val);
        if(front==null){
            front=newnode;
        }else{
        rear.next = newnode;
        }
        rear = newnode;
    }
    public int deque(){
        if(front==null) throw new IndexOutOfBoundsException("queue underflow");
        int temp=front.data;
        front=front.next;
        if(front==null) rear=null;
        return temp;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public int elementAtFront(){
        if(front==null) throw new IndexOutOfBoundsException("queue underflow");
        return front.data;
    }
    public static void main(String[] args) {
        queueLL obj = new queueLL();
        obj.enque(0); 
        obj.enque(1);
        System.out.println(obj.deque());    
        System.out.println(obj.deque());  
        obj.enque(2);  
        System.out.println(obj.isEmpty());
        System.out.println((obj.elementAtFront()));
    }
}
