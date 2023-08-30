import java.util.Scanner;
public class recurrSyndrome {
    static int reverse(int ip)
    {   
        int N = ip,rev=0;
        while(N!=0)
        {
            int digit = N%10;
            rev=rev*10+digit;
            N/=10;
        }
        return rev;
    } 
    static void calc(int sum)
    {
        if(isPallindrome(sum)) {
            System.out.println(sum);
            return;
        }
        calc(sum+reverse(sum));
    }
    static boolean isPallindrome(int n)
    {
        return n==reverse(n);
    }
    public static void main(String[] args) 
    {
        Scanner get = new Scanner(System.in); 
        int ip = get.nextInt();
        int revIP = reverse(ip);
        calc(revIP+ip);
        get.close();
    }
}