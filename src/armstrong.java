//Problem Statement: Given a number, check if it is Armstrong Number or Not.

public class armstrong {
    static boolean asn(int n){
        int asn = 0;
        int N=n;
        while(N!=0){
            int digit = N%10;
            asn+=Math.pow(digit,3);
            N/=10;
        }
        return asn==n;
    }
    public static void main(String[] args) {
        System.out.println(asn(153));
    }
}