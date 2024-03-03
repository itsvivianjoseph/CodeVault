class SumPossible {
    public static void main(String[] args) {
        int amt = 15;
        int[] nums = {4,6,10};
        System.out.println(sumPossible(amt, nums, 0, nums.length));
    }

    static boolean sumPossible(int target, int[] nums, int idx, int n) {
        if (target == 0) {
            return true;
        }
        if (target < 0 || idx == n) {
            return false;
        }

        if (sumPossible(target - nums[idx], nums, idx, n) || sumPossible(target, nums, idx + 1, n)) {
            return true;
        }

        return false;
    }
}
