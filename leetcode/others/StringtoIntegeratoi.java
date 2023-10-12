package others;

public class StringtoIntegeratoi {
    public int myAtoi(String s) {
        s = s.trim();
        
        if (s.isEmpty()) {
            return 0; 
        }
        
        int index = 0;
        int sign = 1; 
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }
        
        long result = 0; 
        for (; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                result = result * 10 + digit;
                
                if (result * sign > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (result * sign < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }else {
                break;
            }
        }
        
        return (int) (result * sign);
    }

}
