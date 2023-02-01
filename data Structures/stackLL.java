public class stackLL {
    class node {
        int data;
        node next;
        node(int val){
            data = val;
            next=null;
        }
    }
    node top ;
    stackLL(){
        top = null;
    }
    void push(int val){
        node newnode = new node(val);
        newnode.next = top;
        top = newnode;
    }
    void pop(){
        if(top==null) throw new IndexOutOfBoundsException("stack underflow");
        System.out.println("deleted element : "+top.data);
        top=top.next;
    }
    void peek(){
        System.out.println("top element : "+top.data);
    }
    public static void main(String[] args) {
        stackLL obj = new stackLL();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.peek();
    }
}
