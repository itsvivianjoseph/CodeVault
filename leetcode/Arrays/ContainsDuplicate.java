package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) if(!set.add(nums[i])) return true;
        return false;
    }
}
