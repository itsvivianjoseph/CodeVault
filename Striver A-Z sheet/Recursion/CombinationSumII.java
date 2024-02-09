package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class CombinationSumII {
    List<List<Integer>> res = new ArrayList<>();
    private void combinationSumII(int[] nums, int idx, List<Integer> ds, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > target) {
                return;
            }

            ds.add(nums[i]);
            combinationSumII(nums, i + 1, ds, target - nums[i]);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumII(candidates, 0, ds, target);

        return res;
    }

    public static void main(String[] args) {
        CombinationSumII obj = new CombinationSumII();
        List<List<Integer>> res = obj.combinationSum2(new int[] {14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12}, 27);
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}