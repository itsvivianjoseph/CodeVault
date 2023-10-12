package Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int len = digits.length;

        for (int i = len - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            if(carry==0) return digits;
        }

        if (carry > 0) {
            int[] result = new int[len + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, len);
            return result;
        }
        
        return digits;
    }
}
