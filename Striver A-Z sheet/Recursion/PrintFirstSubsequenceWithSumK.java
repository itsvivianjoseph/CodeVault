package Recursion;
// import java.util.List;
// import java.util.ArrayList;

public class PrintFirstSubsequenceWithSumK {
    static int sum = 0;
    static int printFirstSubsequenceWithSumK(int[] nums,int idx,int n,int target){
        if(idx == n){
            if(sum == target) {
                // for (Integer i : ds) {
                //     System.out.print(i + " ");
                // }
                return 1;
            }
            else return 0;
        }
        // take
        // ds.add(nums[idx]);
        sum += nums[idx];
        int left = printFirstSubsequenceWithSumK(nums, idx+1, n, target);
        // not take
        // ds.remove(ds.size()-1);
        sum -= nums[idx];
        int right = printFirstSubsequenceWithSumK(nums, idx+1, n, target);

        return left + right;
    }
    // static boolean printFirstSubsequenceWithSumK(int[] nums,int idx,List<Integer> ds,int n,int target){
    //     if(idx == n){
    //         if(sum == target) {
    //             for (Integer i : ds) {
    //                 System.out.print(i + " ");
    //             }
    //             return true;
    //         }
    //         else return false;
    //     }
    //     // take
    //     ds.add(nums[idx]);
    //     sum += nums[idx];
    //     if(printFirstSubsequenceWithSumK(nums, idx+1, ds, n, target) == true) return true;
    //     // not take
    //     ds.remove(ds.size()-1);
    //     sum -= nums[idx];
    //     if(printFirstSubsequenceWithSumK(nums, idx+1, ds, n, target) == true) return true;

    //     return false;
    // }
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        // List<Integer> ds = new ArrayList<Integer>();
        System.out.println(printFirstSubsequenceWithSumK(nums,0,nums.length,1));
    }
}
