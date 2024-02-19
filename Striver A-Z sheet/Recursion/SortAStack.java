package Recursion;

import java.util.*;

class SortAStack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        sort(stack);
        System.out.println(stack);
    }
    static void sort(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int top = stack.pop();
            sort(stack);
            reInsert(stack,top);
        }
    }
    static void reInsert(Stack<Integer> stack,int curr){
        if(stack.isEmpty() || stack.peek() <= curr) stack.push(curr);
        else {
            int temp = stack.pop();
            reInsert(stack,curr);
            stack.push(temp);
        }
    }
}