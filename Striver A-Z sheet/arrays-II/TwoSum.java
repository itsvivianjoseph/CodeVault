import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])) {
                return new int[] { i,hm.get(target-nums[i]) };
            }
            hm.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] res = twoSum(nums,5);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }    
}
