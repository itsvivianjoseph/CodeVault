package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
        public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : nums) {
            int index = Math.abs(i);
            if(nums[index-1]>0) {
                nums[index-1] *= -1; 
            }           
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0) list.add(i+1);
        }
        return list;
    }
}
