package Recursion;

import java.util.*;

public class SubsetSumII {
    Set<List<Integer>> res = new HashSet<List<Integer>>();

    public void subSetSum(int[] nums, int idx, List<Integer> ds, int n) {
        if (idx == n) {
            res.add(new ArrayList<>(ds));
            return;
        }
        // take
        ds.add(nums[idx]);
        subSetSum(nums, idx + 1, ds, n);
        ds.remove(ds.size() - 1);

        // not take
        subSetSum(nums, idx + 1, ds, n);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        SubsetSumII obj = new SubsetSumII();
        
        Arrays.sort(nums);
        obj.subSetSum(nums, 0, new ArrayList<Integer>(), nums.length);

        List<List<Integer>> resultList = new ArrayList<>(obj.res);

        for (List<Integer> list : resultList) {
            System.out.print(list + " ");
        }
    }
}