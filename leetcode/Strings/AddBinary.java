package Strings;
public class AddBinary {
    static String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder output = new StringBuilder();
        int length = Math.max(a.length(),b.length());

        for (int i = a.length() - 1, z = b.length() - 1; length > 0; i--, z--, length--) {
            int x = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int y = (z >= 0) ? Character.getNumericValue(b.charAt(z)) : 0;

            int sum = x + y + carry;
            output.append(sum % 2); 
            carry = sum / 2; 
        }

        if(carry > 0) output.append(carry);
        return output.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
}