import java.util.ArrayList;

class permutations
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
        int[] nums = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = permute(nums);
        System.out.println(ans);
    }
}