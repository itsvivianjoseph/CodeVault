import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {

    // public static List<List<Integer>> threeSum(int[] nums) {
    //     ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
    //     int a;
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length-1;i++)
    //     {
    //         a=nums[i];
    //         if((i>0)&&(nums[i-1]==a)) continue;
    //         else 
    //         {
    //         int l = i+1;
    //         int r = nums.length-1;
    //         while(l<r)
    //         {
    //             int sum = a+nums[l]+nums[r];
    //             if(sum>0) r-=1;
    //             else if(sum<0) l+=1;
    //             else {
    //                 result.add(Arrays.asList(a,nums[l],nums[r]));
    //                 System.out.println(a+" "+nums[l]+" "+nums[r]);
    //                 l+=1;
    //                 while((nums[l]==nums[l-1])&&(l<r)) l+=1;
    //             }
    //         }
    //         }
    //     }
    //     return result;
    // }

    static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, sum = -nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) 
                    {
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        int[] arr ={1,2,-2,-1};
        threeSum(arr);
    }    
}
