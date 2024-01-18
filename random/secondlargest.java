public class secondlargest {
    // System.out.println("hello world!");
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6};
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>large){
                sec_large = large;
                large = ar[i];
            }
            else if((ar[i]>sec_large)&&(ar[i]!=large)) sec_large=ar[i];
        }
        System.out.println(large);
        System.out.println(sec_large);
    }
}
