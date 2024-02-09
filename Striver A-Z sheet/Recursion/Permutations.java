package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> res = new ArrayList<>();

    private void permute(int[] nums, List<Integer> ds, boolean[] freq, int n) {
        if (ds.size() == n) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                permute(nums, ds, freq, n);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;
        boolean[] freq = new boolean[n];
        Permutations obj = new Permutations();
        obj.permute(nums, new ArrayList<Integer>(), freq, n);

        for (List<Integer> list : obj.res) {
            System.out.print(list + " ");
        }
    }
}
