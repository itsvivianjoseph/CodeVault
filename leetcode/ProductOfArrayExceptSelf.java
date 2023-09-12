class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // int res[] = new int[nums.length];
        int prod = 1;
        int idx = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                idx = i;
                for(int j=i+1;j<nums.length;j++)
                {
                    prod *= nums[j];
                    nums[j]=0; 
                }
                for(int j=0;j<idx;j++) nums[j]=0;
                nums[idx] = prod;
                return nums;
            }
            prod*=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = prod/nums[i];
        }
        return nums;
    }
}
// int prod = 1;
// for(int i=0;i<nums.length;i++){ 
//     if(nums[i]==0)
//     {
//         for(int j=0;j<nums.length;j++) {
//             if(nums[j]!=0) {
//                 prod*=nums[j];
//             }
//             nums[j]=0;
//         }
//         nums[i] = prod;
//         return nums;
//     }
//     prod*=nums[i];
// }
// for(int i=0;i<nums.length;i++) nums[i] = prod/nums[i];
// return nums;