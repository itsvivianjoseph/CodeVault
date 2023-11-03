package Arrays;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        double res  = 0;
        double avg = 0;
        int idx = 0;
        while(idx<k){ res+=nums[idx++]; }
        avg = res/k;
        for(idx=k;idx<nums.length;idx++){
            res = res - nums[idx-k] + nums[idx];
            avg = Math.max(avg,res/k); 
        }
        return avg;
    }
}