import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void printPascal(int n) {
        ArrayList<Long> dummy = new ArrayList<>(); 
        dummy.add((long) 1.000000000);
        for(int i=1;i<n;i++)
        {
            dummy.add((long) Math.pow(11,i));
        }
        System.out.println(dummy);
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        printPascal(n);
        get.close();
    }    
}