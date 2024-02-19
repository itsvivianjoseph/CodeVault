import java.util.Scanner;

public class SquareTiles {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        long n = get.nextLong();
        long m = get.nextLong();
        long a = get.nextLong();

        long width = (long) Math.ceil((double) n / a);
        long height = (long) Math.ceil((double) m / a);

        System.out.println(width*height);
        get.close();
    }    
}
