package Recursion;

import java.util.ArrayList;
import java.util.List;

class Basic{
    public static void main(String[] args){
        // printNameNTimes("vivian",5);
        // printLinearlyFromOneToN(5);
        // printNToOne(5);
        List<List<Integer>> ans = combine(4, 2);
        for (List<Integer> list : ans) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    static List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0;i<n;i++) nums[i] = i+1;
        List<Integer> ds = new ArrayList<Integer>();
        generateAllPairsOfSizeK(nums,0,ds,n,k);
        return res;
    }

    static List<List<Integer>> res = new ArrayList<>();

    static void generateAllPairsOfSizeK(int[] nums,int idx,List<Integer> ds,int n,int k){
        if(ds.size() == k){
            res.add(new ArrayList<>(ds));
        }
        if(idx == n){
            return;
        }
        // take
        ds.add(nums[idx]);
        generateAllPairsOfSizeK(nums, idx + 1, ds, n, k);
        ds.remove(ds.size() - 1);

        // not take
        generateAllPairsOfSizeK(nums, idx + 1,ds, n, k);
    }

    static void printNToOne(int n){
        if(n==0) return ;
        System.out.println(n);
        printNToOne(n-1);
    }
    static void printLinearlyFromOneToN(int n){
        if(n==0) return;
        printLinearlyFromOneToN(n-1);
        System.out.println(n);
    }
    static void printNameNTimes(String name,int n){
        if(n==0) return;
        System.out.println(name);
        printNameNTimes(name,n-1);
    }
}