import java.util.List;
import java.util.ArrayList;

public class LeadersinanArray {
    static List<Integer> leader(int[] nums){
        int leader = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<Integer>();
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i] > leader){ 
                leader = nums[i];
                res.add(leader);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {4, 7, 1, 0};
        List<Integer> res = leader(nums);
        System.out.print("leaders of the array are : ");
        for (Integer integer : res) {
            System.out.print(integer+" ");
        }
    }    
}
