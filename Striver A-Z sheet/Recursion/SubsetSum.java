package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    List<Integer> res = new ArrayList<>();
    public void subSetSum(int[] nums,int idx,int sum,int n){
        if(idx == n){
            res.add(sum);
            return;
        }
        // take
        subSetSum(nums, idx+1, sum+nums[idx], n);
        // not take
        subSetSum(nums, idx+1, sum, n);
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        int sum = 0;
        SubsetSum obj = new SubsetSum();
        obj.subSetSum(nums,0,sum,nums.length);
        Collections.sort(obj.res);
        for (Integer i : obj.res) {
            System.out.print(i + " ");
        }
    }
}
