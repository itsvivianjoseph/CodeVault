import java.util.Arrays;

public class FindDuplicateNumber {
        public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int index=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i]) {
                index=i;
                break;
            }
        }
        return nums[index];
    }

}
