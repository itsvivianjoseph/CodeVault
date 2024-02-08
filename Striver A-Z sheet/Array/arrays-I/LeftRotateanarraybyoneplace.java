public class LeftRotateanarraybyoneplace {
    static void leftRotatebyoneplace(int[] nums){
        int start = nums[0];
        int len = nums.length;
        for(int i=1;i<len;i++) nums[i-1] = nums[i];
        nums[len-1] = start;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        leftRotatebyoneplace(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }    
}
