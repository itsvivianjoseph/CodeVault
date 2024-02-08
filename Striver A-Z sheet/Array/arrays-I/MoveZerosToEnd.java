public class MoveZerosToEnd {
    static void moveZeros(int[] nums){
        int idx = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i] != 0) nums[idx++] = nums[i];
        }
        for(int i=idx;i<len;i++) nums[i] = 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0,1,0,4,0};
        moveZeros(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }    
}
