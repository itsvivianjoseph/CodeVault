public class isprime {
    static boolean isPrime(int n){
        int count=1;
        for(int i=2;i<=n;i++){
            if(n%i==0) count++;
        }
        return count==2;
    }
    public static void main(String[] args) {
        int no= 7;
        System.out.println(no+" is a "+isPrime(no)+" prime");
    }
}
