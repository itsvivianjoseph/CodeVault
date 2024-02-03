public class movezeros {
    public static void main(String[] args) {
        int[] nums = {0};
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0) nums[idx++] = nums[i];
        }
        if(idx == nums.length) System.out.println("over");
        else{
            for(int i=idx;i<nums.length;i++) nums[i] = 0;
        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
