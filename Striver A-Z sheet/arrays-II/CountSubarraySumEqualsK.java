import java.util.HashMap;

public class CountSubarraySumEqualsK {
    static int countSubarraySumEqualsK(int[] nums,int k){
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];

            int remove = prefixSum - k;

            count += hm.getOrDefault(remove, 0);
            
            hm.put(prefixSum, hm.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(countSubarraySumEqualsK(nums,6));
    }    
}