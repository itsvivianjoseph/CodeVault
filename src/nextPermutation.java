import java.util.ArrayList;

class nextPermutation
{
    static ArrayList<ArrayList<Integer>> permute(int[] nums)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums,ds,ans,freq);
        return ans;
    }
    private static void recurPermute(int[] nums, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans,boolean[] freq) 
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                ds.add(nums[i]);
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,4,5};
        int idx=0;
        ArrayList<ArrayList<Integer>> ans = permute(nums);
        for(int i=0;i<ans.size();i++)
        {
            ArrayList<Integer> arr = ans.get(i);
            int[] item = listToArray(arr);
            if(isSame(item,nums))
            {
                idx=i+1;
                break;
            }
        }
        System.out.println(ans.get(idx));
    }
    private static int[] listToArray(ArrayList<Integer> arr) {
        int[] item = new int[arr.size()];
        for(int i=0;i<arr.size();i++) item[i]=arr.get(i);
        return item;
    }
    static boolean isSame(int[] arr1,int[] arr2)
    {
        if(arr1.length!=arr2.length) return false;
        else{
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr2[i]) return false;
            }
            return true;
        }
    }
}

// import java.util.*;
// public class nextPermutation {
//     static void getNextPermutation(int arr[])
//     {
//         int temp = arr[arr.length-2];
//         arr[arr.length-2] = arr[arr.length-1];
//         arr[arr.length-1] = temp;
//         System.out.print("next permutation : ");
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
//     static int digitCount(int number)
//     {
//         int count = 0;
//         while(number!=0)
//         {
//             count++;
//             number/=10;
//         }
//         return count;
//     }
//     static int[] numberToArray(int number)
//     {
//         int N = number;
//         int[] arr = new int[digitCount(number)];
//         int i = digitCount(number)-1;
//         while(N!=0)
//         {
//             int digit = N%10;
//             arr[i--] = digit;
//             N/=10;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         Scanner get = new Scanner(System.in);
//         int permutation = get.nextInt();
//         System.out.println("given permutation : "+permutation);
//         getNextPermutation(numberToArray(permutation));
//         get.close();
//     }
// }
