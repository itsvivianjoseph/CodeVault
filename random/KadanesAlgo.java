public class KadanesAlgo {
    // static int[] maxsubarray(int[] arr) 
    // {
    //     int start=0,end=0,curr_sum=0,max_sum=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         curr_sum=0;
    //         for(int j=0;j<arr.length;j++)
    //         {
    //             curr_sum+=arr[j];
    //             if(curr_sum>max_sum) 
    //             {
    //                 max_sum=curr_sum;
    //                 start=i;
    //                 end=j;
    //             }
    //         }
    //     }
    //     System.out.println("MAX SUM : "+max_sum);
    //     return new int[]{start,end};
    // }
    
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int maxsum = Integer.MIN_VALUE, currsum = 0;
 
        for (int i = 0; i < size; i++) {
            currsum = currsum + a[i];
            if (maxsum < currsum) maxsum = currsum;
            if (currsum < 0) currsum = 0;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, -2, 6, -8, 5};
        int res = maxSubArraySum(arr);
        System.out.print("MAX SUBARRAY : " + res);
    }
}