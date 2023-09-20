class ProductOfArrayExceptSelf {
    //optimal same - 2ms solution
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];
    
        // Initialize leftProducts and rightProducts arrays
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
    
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
    
        // Calculate the final result
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        // for (int i : leftProducts) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for (int i : rightProducts) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for (int i : nums) {
        //     System.out.print(i+" ");
        // }
    
        return result;
    }
    public static void main(String[] args) {
        productExceptSelf(new int[] {1,2,3,4});
    }
    // my 2 ms solution 
    // public int[] productExceptSelf(int[] nums) {
    //     // int res[] = new int[nums.length];
    //     int prod = 1;
    //     int idx = 0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(nums[i]==0)
    //         {
    //             idx = i;
    //             for(int j=i+1;j<nums.length;j++)
    //             {
    //                 prod *= nums[j];
    //                 nums[j]=0; 
    //             }
    //             for(int j=0;j<idx;j++) nums[j]=0;
    //             nums[idx] = prod;
    //             return nums;
    //         }
    //         prod*=nums[i];
    //     }
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         nums[i] = prod/nums[i];
    //     }
    //     return nums;
    // }
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