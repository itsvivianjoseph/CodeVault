public class Kadane {
    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum1 = findMaxSubarraySum(nums1);
        System.out.println("Maximum Subarray Sum 1: " + sum1);

        int[] nums2 = {-1, -2, -3, -4};
        int sum2 = findMaxSubarraySum(nums2);
        System.out.println("Maximum Subarray Sum 2: " + sum2);
    }

    public static int findMaxSubarraySum(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
