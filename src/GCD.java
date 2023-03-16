//Problem Statement: Find gcd of two numbers
public class GCD {
    static int gcd(int n,int m){
        int max = 1;
        for(int i=1;i<Math.min(n,m);i++) if((n%i==0)&&(m%i==0)) max=i;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("the GCD is "+gcd(3, 4));
    }
}
