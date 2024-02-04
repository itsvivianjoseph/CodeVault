// Maximum Subarray Sum in an Array
public class KadaneAlgorithm {
    static int findMaxsubarray(int[] nums){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum < 0) sum = 0;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5};
        System.out.println(findMaxsubarray(nums));
    }    
}
