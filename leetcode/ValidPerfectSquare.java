public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
    if(num==1) return true;
    int left = 1 , right = num;
    while(left<=right){
        int mid = left + (right-left)/2;
        if(mid==num/mid) {
            if(mid*mid==num) return true;
            else return false;
        }
        else if(mid > num/mid) right = mid-1;
        else left=mid+1;
    }
    return false;
}   
}