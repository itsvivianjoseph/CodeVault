public class GCDrec {
    public static void main(String[] args) {
    int m=6;
    int n=5;
    int min = Math.min(m,n);
    int max = Math.max(m,n);
    int temp = min;
    System.out.println(greatcomdiv(min,max,temp));
    }
    static int greatcomdiv(int n,int m,int temp)
    {
      if((n%temp==0)&&(m%temp==0)) return temp;
      return greatcomdiv(n,m,temp-1);
    }
}