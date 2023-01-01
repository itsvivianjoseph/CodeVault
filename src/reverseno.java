public class reverseno {
    static int revno(int n){
        int N = n;
        int rev = 0;
        while(N!=0){
            int digit = N%10;
            rev = (rev*10)+digit;
            N/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("the reverse of the number is "+revno(n));
    }
}
