package others;

public class IntegerBreak {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int q = n/3;
        int rem = n%3;
        if(rem==0){
            return (int)Math.pow(3,q);
        }else if(rem==1){
            return (int)Math.pow(3,q-1)*4;
        }else{
            return (int)Math.pow(3,q)*2;
        }
    }
}
