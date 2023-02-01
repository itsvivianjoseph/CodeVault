@SuppressWarnings("unchecked")
class stackarray<T>
{
    static final int size = 30;
    T[] arr = (T[])new Object[size];
    int top;
    stackarray(){
        top=-1;
    }
    void push(T val){
        if(top==size) throw new IndexOutOfBoundsException("stack overflow!");
        arr[++top] = val;
    }
    void pop(){
        if(top==-1) throw new IndexOutOfBoundsException("stack underflow!");
        T temp = arr[top--];
        System.out.println("deleted element : "+temp);
    }
    void peek(){
        System.out.println("top element :"+arr[top]);
    }
    public static void main(String[] args) {
        stackarray<Integer> obj = new stackarray<Integer>();
        obj.push(1);
        obj.push(2);
        obj.pop();
        obj.peek();
    }
}