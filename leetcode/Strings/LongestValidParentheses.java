// not working  
package Strings;

import java.util.Stack;

public class LongestValidParentheses {
    static int longestValidParentheses(String s) {
        if(s==null || s.equals("")) return 0;
        int len = s.length();
        Stack<Character> st = new Stack<Character>(); 
        st.push(s.charAt(0));
        for(int right=1;right<len;right++){
            char c = s.charAt(right);
            if(st.peek()=='(' && c==')') st.pop(); 
            else st.push(c);
        }
        return len-st.size();
    }
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
    }
}
