package Recursion;

import java.util.List;
import java.util.ArrayList;

class CountAllSubsequencesWithSumK {
    static int sum = 0;
    static int count = 0;

    static void countSubsequences(int[] nums, int idx, List<Integer> ds, int n, int target) {
        if (idx == n) {
            if (sum == target) {
                count++;
            }
            return;
        }

        // take
        ds.add(nums[idx]);
        sum += nums[idx];
        countSubsequences(nums, idx + 1, ds, n, target);

        // not take
        ds.remove(ds.size() - 1);
        sum -= nums[idx];
        countSubsequences(nums, idx + 1, ds, n, target);
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        List<Integer> ds = new ArrayList<>();
        countSubsequences(nums, 0, ds, nums.length, 5);
        System.out.println(count);
    }
}