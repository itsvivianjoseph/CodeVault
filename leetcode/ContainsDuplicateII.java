import java.util.HashMap;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1 || k == 0) return false;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                if (Math.abs(i - hm.get(nums[i])) <= k) {
                    return true;
                }
            }
            hm.put(nums[i], i);
        }
        return false;
    }    
}

// HashSet<Integer> sw = new HashSet<Integer>();
// for(int i=0;i<nums.length;i++)
// {
//     if(i > k) sw.remove(nums[i - k-1]);
//     if(!sw.add(nums[i])) return true;
// }   
// return false;

// for(int i=0;i<nums.length;i++)
// {
//     for(int j=0;j<nums.length;j++)
//     {
//         if(i!=j)
//         {
//             if((nums[i]==nums[j])&&(Math.abs(i-j)==k)) return true;
//         }
//     }
// }
// return false
