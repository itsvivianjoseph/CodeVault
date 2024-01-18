public class secondsmallest {
    public static void main(String[] args) {
        //second smallest
        int[] arr = {1,2,3,4,5,6};
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                sec_small = small;
                small = arr[i];
            }
            else if((arr[i]<sec_small)&&(arr[i]!=small)) sec_small=arr[i];
        }
        System.out.println(small);
        System.out.print(sec_small);
    }
}
