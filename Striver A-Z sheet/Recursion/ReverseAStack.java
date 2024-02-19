// not completed

package Recursion;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        reverse(stack);
    }
    static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        
    }
}
