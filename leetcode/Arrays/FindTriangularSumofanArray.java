package Arrays;

public class FindTriangularSumofanArray {
    //optimal sol
    public int helper(int[] arr, int n) 
    {
        if(n == 1) return arr[0];
        for(int i=0;i<n-1;i++) arr[i]=(arr[i]+arr[i+1])%10;
        return helper(arr,n-1);
    }
    public int triangularSum(int[] nums)
    {
      return helper(nums, nums.length); 
    }
}

// my sol
// class Solution {
//     public int triangularSum(int[] nums) {
//         if(nums.length==1) return nums[0]; 
//         while(nums.length>1){
//             int n = nums.length;
//             int[] newNums = new int[n-1];
//             for(int i=0;i<n-1;i++){
//                 newNums[i] = (nums[i] + nums[i+1]) % 10;
//             }
//             nums = newNums;
//         }
//         return nums[0];
//     }
// }