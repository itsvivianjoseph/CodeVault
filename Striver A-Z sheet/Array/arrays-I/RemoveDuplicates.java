public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[idx] != nums[i]) nums[++idx] = nums[i];
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4, 5};
        int idx = removeDuplicates(nums);
        for (int i = 0; i <= idx; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}