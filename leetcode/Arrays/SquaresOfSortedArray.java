package Arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
        public int[] sortedSquares(int[] nums) {
        int idx =0;
        for(int i : nums)
        {
            nums[idx++] = i*i;
        }
        Arrays.sort(nums);
        return nums;
    }
}
