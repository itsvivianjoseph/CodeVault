package Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int idx = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[idx-2]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
// if (nums == null || nums.length == 0) return 0;

// HashMap<Integer, Integer> hm = new HashMap<>();

// int idx = 0;
// for (int i = 0; i < nums.length; i++) {
//     int num = nums[i];
//     if (hm.containsKey(num)) {
//         int count = hm.get(num);
//         if (count < 2) {
//             nums[idx++] = num;
//             hm.put(num, count + 1);
//         }
//     } else {
//         nums[idx++] = num;
//         hm.put(num, 1);
//     }
// }
// return idx;
}
