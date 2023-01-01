//Problem Statement:  Given a number check if it is a palindrome.
public class palindrome {
    static int revno(int n){
        int N=n;
        int rev = 0;
        while(N!=0){
            int digit  =N%10;
            rev = rev*10 + digit;
            N/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int no1 = 123;
        int no2 = 321;
        System.out.println(no1==revno(no2));
    }
}
