public class KadanesAlgo {
    static int[] maxsubarray(int[] arr) 
    {
        int start=0,end=0,curr_sum=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            curr_sum=0;
            for(int j=0;j<arr.length;j++)
            {
                curr_sum+=arr[j];
                if(curr_sum>max_sum) 
                {
                    max_sum=curr_sum;
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println("MAX SUM : "+max_sum);
        return new int[]{start,end};
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, -2, 6, -8, 5};
        int[] res=maxsubarray(arr);
        System.out.print("MAX SUBARRAY : ");
        for(int i=res[0];i<=res[1];i++) System.out.print(arr[i]+" ");
    }
}