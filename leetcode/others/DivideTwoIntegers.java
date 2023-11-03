package others;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean neg = false;
        int count = 0;

        long a = dividend;
        long b = divisor;

        if (a < 0 && b < 0) {
            a = -a;
            b = -b;
        } else if (a < 0 || b < 0) {
            neg = true;
            if (a < 0) a = -a;
            else b = -b;
        }

        if (b == 1 && neg && dividend < 0) return dividend;
        else if (b == 1 && !neg) return (int) a;

        if (a == b) {
            return neg ? -1 : 1;
        }

        while (a >= b) {
            a -= b;
            count++;
        }

        return neg ? -count : count;
    }
}
//sol 2
// boolean neg = false;
// int count = 0;

// long a = dividend;
// long b = divisor;

// if(a < 0 && b < 0) {
//     a = -a;
//     b = -b;
// }
// else if(a < 0 || b < 0){
//     neg = true;
//     if(a < 0) a = -a;
//     else b = -b;
// }

// if(b==1) return neg ? -dividend : dividend;

// if(a==b) return neg ? -1 : 1;

// while(a > b) {
//     a -= b;
//     count++;
// }

// return neg ? -count : count;


// sol 1
// int count = 0;
// boolean neg = false;

// if(a < 0 && b <0){
//     if(a==Integer.MIN_VALUE) a = Integer.MAX_VALUE;
//     else a = -a;
//     if(b==Integer.MIN_VALUE) b = Integer.MAX_VALUE;
//     else b = -b;
// }

// if(a < 0 || b < 0){
//     neg = true;
//     if(a==Integer.MIN_VALUE) a = Integer.MAX_VALUE;
//     else if(a < 0) a = -a;
//     if(b==Integer.MIN_VALUE) b = Integer.MAX_VALUE;
//     else if(b < 0) b = -b;
// }

// if(b == 1) {
//     if(neg && a==Integer.MAX_VALUE) return Integer.MIN_VALUE;
//     else if(neg) return -a;
//     else return a;
// }

// if(a == b) return neg ? -1 : 1;

// while(a > b){
//     a-=b;
//     count++;
// }

// return neg ? -count : count;