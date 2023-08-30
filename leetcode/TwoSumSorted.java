class TwoSumSorted {
    static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            int diff = target-nums[i];
            diff = binarySearch(nums,diff);
            if(diff>0) return new int[] {i+1,diff+1};
        }
        return new int[] {0,0};
    }
    static int binarySearch(int[] arr,int key)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==key) return mid;
            else if(key>arr[mid]) low=mid+1;
            else high=mid; 
        }
        return -1;
    } 
    public static void main(String[] args) {
        int[] arr = {5,25,75};
        twoSum(arr,100);
    }
}