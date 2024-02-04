public class LongestSubarrayWithSumK {
    static int findLongestSubarrWithSumK(int[] nums,int k){
        
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = nums[0];
        int n = nums.length;

        while(right < n){

            while(left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if(sum == k) maxLen = Math.max(maxLen,(right-left)+1);
            right++;
            if(right < n) sum += nums[right];
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 1, 1};
        System.out.println(findLongestSubarrWithSumK(nums,3));
    }    
}
