package Arrays;

public class MinimumSumofMountainTripletsI {
    static int findMinMount(int[] nums){
        //sol1
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(i < j && j< k) {
                        if(nums[i] < nums[j] && nums[k] < nums[j]){
                            min = Math.min(min,nums[i] + nums[j] +nums[k]);
                        }
                    }
                }
            }
        }
        return min==Integer.MAX_VALUE ? -1 : min;
        //sol2
        // int len = nums.length;
        // int min = Integer.MAX_VALUE;

        // int[] leftMin = new int[len];
        // int[] rightMin = new int[len];

        // leftMin[0] = nums[0];
        // for (int i = 1; i < len; i++) {
        //     leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        // }

        // rightMin[len - 1] = nums[len - 1];
        // for (int i = len - 2; i >= 0; i--) {
        //     rightMin[i] = Math.min(rightMin[i + 1], nums[i]);
        // }

        // for (int mid = 1; mid < len - 1; mid++) {
        //     if (leftMin[mid] < nums[mid] && rightMin[mid] < nums[mid]) {
        //         int sum = leftMin[mid - 1] + nums[mid] + rightMin[mid + 1];
        //         min = Math.min(min, sum);
        //     }
        // }

        // return min == Integer.MAX_VALUE ? -1 : min;
    }
}
