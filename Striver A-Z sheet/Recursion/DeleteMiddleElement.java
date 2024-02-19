package Recursion;

import java.util.Stack;

public class DeleteMiddleElement {
    static void deleteMiddleElement(Stack<Integer> stack,int idx,int len){
        if(idx == len){
            stack.pop();
            return;
        }
        int temp = stack.pop();
        deleteMiddleElement(stack, idx+1,len);
        stack.push(temp);
        return;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        deleteMiddleElement(stack,0,stack.size()/2);
        System.out.println(stack);
    }
}
