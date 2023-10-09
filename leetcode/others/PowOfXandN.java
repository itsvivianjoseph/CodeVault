package others;

public class PowOfXandN {
    // if (n == 0) {
    //     return 1.0;
    // }
    // double result = 1.0;
    // long absN = Math.abs((long) n);
    // while (absN > 0) {
    //     if (absN % 2 == 1) {
    //         result *= x;
    //     }
    //     x *= x;
    //     absN /= 2;
    // }
    // return n < 0 ? 1 / result : result;
    
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0; 
        }
        if (n == 0) {
            return 1;
        }
        
        double res = helper(x, Math.abs((long) n)); 
        
        return n >= 0 ? res : 1 / res;
    }
    
    private double helper(double x, long n) {
        if (n == 0) {
            return 1;
        }
        
        double half = helper(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
}

// my sol - doesnt work for very big ints
// if (n == 0) return 1;
// if (n == 1) return x;
// if (n < 0) return 1 / myPow(x, -n);
// return x * myPow(x, n - 1);