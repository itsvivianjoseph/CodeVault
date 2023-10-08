package others;
public class ReverseInteger {
    public int reverse(int x) {
        int neg=0;
        if(x<0) 
        {
            neg=1;
            x*=-1;
        }
        int rev=0;
        while(x!=0)
        {
            int digit = x%10;
            if(rev>(Integer.MAX_VALUE-digit)/10) return 0;
            rev=(rev*10)+digit;
            x/=10;
        }
        return (neg==1) ? -rev : rev; 
    }
}
