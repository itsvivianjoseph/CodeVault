import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        int a;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            a=nums[i];
            if((i>0)&&(nums[i-1]==a)) continue;
            else 
            {
            int l = i+1;
            int r = nums.length-1;
            int sum = a+nums[l]+nums[r];
            while(l<r)
            {
                if(sum>0) r-=1;
                else if(sum<0) l-=1;
                else {
                    // result.add(Arrays.asList(a,nums[l],nums[r]));
                    System.out.println(a+" "+nums[l]+" "+nums[r]);
                    l+=1;
                    while((nums[l]==nums[l-1])&&(l<r)) l+=1;
                }
            }
            }
        }
        return result;
    }
    public static void main(String[] args) 
    {
        // ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        int[] arr ={1,2,3,-3,-2,0};
        threeSum(arr);
    }    
}
