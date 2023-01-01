public class printalldiv {
    static void alldiv(int n){
        for(int i=1;i<n;i++){
            if(n%i==0) System.out.print(i+" ");
        }
        return;
    }
    public static void main(String[] args) {
        int n = 36;
        alldiv(n);
    }
}
