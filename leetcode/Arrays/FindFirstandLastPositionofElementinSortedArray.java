package Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int[] res = new int[2];
        res[0] = res[1] = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                res[0] = mid;
                right = mid-1;
            }else if(nums[mid]<target) left = mid+1;
            else right=mid-1;
        }
        left = 0;
        right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                res[1] = mid;
                left = mid+1;
            }else if(nums[mid]<target) left = mid+1;
            else right=mid-1;
        }
        return res;
    }
}
