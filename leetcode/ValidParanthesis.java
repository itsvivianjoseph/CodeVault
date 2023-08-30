import java.util.Stack;

public class ValidParanthesis 
{
    static boolean isvalid(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if(c=='(' ||c=='[' || c=='{') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if((c==')' && top=='(')||(c==']' && top=='[')||(c=='}' && top=='{')) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isvalid(str));
    }
}
