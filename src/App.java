import java.util.Scanner;

public class App
{
    // static boolean armNo(int n)
    // {
    //     int N=n,sum=0;
    //     while(N>0)
    //     {
    //         int digit = N%10;
    //         sum+=Math.pow(digit, 3);
    //         N=N/10;
    //     }
    //     return sum==n;
    // }
    
    // static boolean isArraySorted(int arr[])
    // {
    //     for(int i=1;i<arr.length;i++)
    //     {
    //         if(arr[i]<arr[i-1]) return false;
    //     }
    //     return true;
    // }

    static void countDigits(int n)
    {
        int N = n,count=0;
        while(N>0)
        {
            count++;
            N/=10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n;
        Scanner get = new Scanner(System.in);
        n = get.nextInt();
        countDigits(n);
        get.close();
    }
}