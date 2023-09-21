public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        int low = 0, high = nums.length-1;
        while(low<high) {
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[mid+1]) high = mid;
            else low = mid+1;
        }
        return low;
    }
    // my 0ms solution
    // int max = 0;
    // for(int i=0;i<nums.length;i++)
    // {
    //     if(nums[i]>nums[max]) max=i;
    // }
    // return max;
}
