public class TwoSumII {
    // static int search(int[] nums, int target) {
    //     int low = 0;
    //     int high = nums.length - 1;
        
    //     while(low <= high){
    //         int mid = (low + high) / 2;
    //         if(nums[mid] == target) return mid;
    //         else if(target > nums[mid]) low = mid + 1;
    //         else high = mid - 1;
    //     }
    //     return -1;
    // }
    static int[] twoSum(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<right)
        {
            int sum = nums[left]+nums[right];
            if(sum>target) right--;
            else if(sum<target) left++;
            else return new int[] {nums[left],nums[right]};
        }
        return new int[] {0,0};
        // for(int i=0;i<nums.length;i++)
        // {
        //     int diff = target - nums[i];
        //     int idx = search(nums,diff);
        //     if(idx!=-1) {
        //         return new int[] { i+1, idx+1 };
        //     }
        // }
        // return new int[] {0,0};
    }
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {2,7,11,15},9 ));
    }
}