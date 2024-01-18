public class onetoNrec {
    static void print(int n){
        if(n==0) return;
        System.out.println(n);
        n--;
        print(n);
    }
    public static void main(String[] args) {
        int n=10;
        print(n);
    }
}
