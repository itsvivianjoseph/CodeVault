package others;
public class PowerOfThree {
    public static void main(String[] args) {
        int n = 8;

        boolean result = isPowerOfThree(n);

        System.out.println(result);
    }
    
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n % 3 == 0) {
            n /= 3;
        }
        
        return n == 1;
    }
    // method 2 
    // Check if n is greater than 0 and if 1162261467 is divisible by n without remainder.
    // return n > 0 && 1162261467 % n == 0;
}