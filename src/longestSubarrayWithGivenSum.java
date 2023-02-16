public class longestSubarrayWithGivenSum {
    // static void subarrayWithMaxSum(int[] arr,int sum)
    // {
    //     int curr_sum=0;
    //     int max=-1;
    //     for (int i = 0; i < arr.length-1; i++) {
    //         for(int j=i+1;j<arr.length;j++)
    //         {
    //             curr_sum+=arr[j];
    //             if(curr_sum==sum && max<j-i){
    //                 max=j-i;
    //                 System.out.println((max)+" found");
    //             }
    //         }
    //         curr_sum=0;
    //     }
    // }
    static void subarrayWithMaxSum(int[] arr,int sum)
    {
        int curr_sum=0,max=-1,start=0,end=-1;
        while(start<arr.length)
        {
            while(((end+1)<arr.length) && (arr[end+1]+curr_sum<=sum)) curr_sum+=arr[++end];
            if(curr_sum==sum) max=Math.max(max,start+end);

            curr_sum-=arr[start];
            start++;
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int sum = 10;
        int[] arr = {0,1,2,3,4};
        subarrayWithMaxSum(arr,sum);
    }
}
