import java.util.HashMap;

class TwoSum {
    static int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        // hm.remove(hm)
        for(int i=0;i<nums.length;i++)
        {
            int diff = target-nums[i];
            if(hm.containsKey(diff)) return new int[] {hm.get(diff),i};
            hm.put(nums[i], i);
        }
        return new int[] {0,0};
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] res = twoSum(arr,target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}