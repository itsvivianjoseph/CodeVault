package others;
public class Sqroot {
    static int mySqrt(int x) {
        if(x==0) return x;
        int left = 1 , right = x;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid==x/mid) return mid;
            else if(mid > x/mid) right = mid-1;
            else left=mid+1;
        }
        return right;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));   
    }
}
// Approach for this Problem:
// If x is 0, return 0.
// Initialize first to 1 and last to x.
// While first is less than or equal to last, do the following:
// a. Compute mid as first + (last - first) / 2.
// b. If mid * mid equals x, return mid.
// c. If mid * mid is greater than x, update last to mid - 1.
// d. If mid * mid is less than x, update first to mid + 1.
// Return last.