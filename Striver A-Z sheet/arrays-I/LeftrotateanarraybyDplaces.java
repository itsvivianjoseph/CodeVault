class LeftrotateanarraybyDplaces{
    static void leftRotateByDplaces(int[] nums,int shift){
        int len = nums.length;
        swap(nums,0,shift-1);
        swap(nums,shift,len-1);
        swap(nums,0,len-1);
    }
    static void swap(int[] nums,int left,int right){
        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        leftRotateByDplaces(nums,2);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}