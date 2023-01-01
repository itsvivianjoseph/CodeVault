public class countdigits {
    static int cd(int n){
        int count = 0;
        while(n!=0) {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n =10000;
        System.out.println("the digits count in the number is "+cd(n));
    }
}
