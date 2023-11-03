package Arrays;

public class MinimumSumofMountainTripletsII {
    public int minimumSum(int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE;

        int[] leftMin = new int[len];
        int[] rightMin = new int[len];

        leftMin[0] = nums[0];
        for (int i = 1; i < len; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }

        rightMin[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i]);
        }

        for (int mid = 1; mid < len - 1; mid++) {
            if (leftMin[mid] < nums[mid] && rightMin[mid] < nums[mid]) {
                int sum = leftMin[mid - 1] + nums[mid] + rightMin[mid + 1];
                min = Math.min(min, sum);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

// public int minimumSum(int[] nums) {
//     int len = nums.length;
//     int min = Integer.MAX_VALUE;
//     for (int mid = 1; mid < len - 1; mid++) {
//         int leftMin = findLeftMin(nums, mid - 1);
//         int rightMin = findRightMin(nums, mid + 1);
//         if (leftMin < nums[mid] && rightMin < nums[mid]) {
//             min = Math.min(min, leftMin + nums[mid] + rightMin);
//         }
//     }
//     return min == Integer.MAX_VALUE ? -1 : min;
// }
// static int findLeftMin(int[] nums, int idx) {
//     int min = Integer.MAX_VALUE;
//     for (int i = idx; i >= 0; i--) {
//         min = Math.min(min, nums[i]);
//     }
//     return min;
// }
// static int findRightMin(int[] nums, int idx) {
//     int min = Integer.MAX_VALUE;
//     for (int i = idx; i < nums.length; i++) {
//         min = Math.min(min, nums[i]);
//     }
//     return min;
// }