import java.util.HashMap;

public class twoSum {
    //normal approach
    // public static void TwoSum(int[] arr,int key)
    // {
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         for(int j=i+1;j<arr.length;j++)
    //         {
    //             if(arr[i]+arr[j]==key) System.out.println("postion-"+i+" "+j);
    //         }
    //     }
    //     return;
    // }
    //optimal approach
    public static void TwoSum(int[] arr,int key)
    {
        HashMap<Integer,Integer> complements = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            Integer complement = complements.get(arr[i]);
            if(complement!=null)
            {
                System.out.println("postion-"+i+" "+complement);
                return;
            }
            complements.put(key-arr[i],i);
        }
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,5,4,0,9,8,6,4,3,8};
        TwoSum(arr,9);    
    }
}
