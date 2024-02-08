package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {
    static void printAllSubsequences(int[] nums, List<Integer> ds, int idx, int n) {
        if (idx == n) {
            // If the end of the array is reached, print the current subsequence
            for (Integer i : ds) {
                System.out.print(i + " ");
            }
            System.out.println();  // Print a newline after each subsequence
            return;
        }

        // Take the current element
        ds.add(nums[idx]);
        printAllSubsequences(nums, ds, idx + 1, n);

        // Do not take the current element (backtrack)
        ds.remove(ds.size() - 1);
        printAllSubsequences(nums, ds, idx + 1, n);
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        List<Integer> ds = new ArrayList<>();
        printAllSubsequences(nums, ds, 0, nums.length);
    }
}