public class MaximumConsecutiveOne {
    static int maxConsecutiveOne(int[] nums) {
        int maxLen = 0;
        int zeroCount = 0;
        int left = 0;

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 0) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(maxConsecutiveOne(nums));
    }
}