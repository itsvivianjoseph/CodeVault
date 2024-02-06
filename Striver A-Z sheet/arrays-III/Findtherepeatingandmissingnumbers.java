import java.util.ArrayList;
import java.util.List;

public class Findtherepeatingandmissingnumbers {
    static List<Integer> findtherepeatingandmissingnumbers(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i : nums){
            int index = Math.abs(i) - 1;
            nums[index] *= -1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0) res.add(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,5,3};
        List<Integer> res = findtherepeatingandmissingnumbers(nums);
        for (Integer i : res) {
            System.out.println(i+" ");
        }
    }    
}