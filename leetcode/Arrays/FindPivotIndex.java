package Arrays;
class FindPivotIndex{
    public int pivotIndex(int[] nums) {
        
        int totalSum = 0;
        int n = nums.length;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}