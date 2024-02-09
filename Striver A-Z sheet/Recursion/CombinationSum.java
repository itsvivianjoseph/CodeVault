package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

    static void combinationSum(int[] nums,int idx,List<Integer> ds,int n,int target){
        if(target < 0) return;
        if(idx == n){
            if(target == 0){ 
                res.add(new ArrayList<>(ds));
                return;
            }
            else return; 
        }
        // take
        if(nums[idx] <= target){
            ds.add(nums[idx]);
            combinationSum(nums, idx, ds, n, target-nums[idx]);
            ds.remove(ds.size()-1);
        }
        // not take 
        combinationSum(nums, idx+1, ds, n, target);
    }
}