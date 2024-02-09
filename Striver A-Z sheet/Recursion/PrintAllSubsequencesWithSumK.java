package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequencesWithSumK {
        static void printAllSubsequencesWithSumK(int[] nums, List<Integer> ds, int idx, int n, int target, int sum) {
        if (idx >= n) {
            if (sum == target) {
                for (Integer i : ds) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }

        // take
        ds.add(nums[idx]);
        sum += nums[idx];
        printAllSubsequencesWithSumK(nums, ds, idx + 1, n, target, sum);

        // not take
        ds.remove(ds.size() - 1);
        sum -= nums[idx];
        printAllSubsequencesWithSumK(nums, ds, idx + 1, n, target, sum);
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        List<Integer> ds = new ArrayList<>();
        int target = 5;
        int sum = 0;
        printAllSubsequencesWithSumK(nums, ds, 0, nums.length, target, sum);
    }
}