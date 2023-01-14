import java.util.Stack;

public class minnoswaps {
    public static void main(String[] args)
    {
        String input = "[[][][[]]]][][";
        Stack stack = new Stack<Character>();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='[') stack.push(input.charAt(i));
            if((input.charAt(i)==']')&&(stack.size()!=0)&&((Character)(stack.peek())=='[')) stack.pop();
        }
        if(stack.size()%2==0) System.out.println(stack.size()/2);
        else System.out.println((stack.size()+1)/2);
    }
}
