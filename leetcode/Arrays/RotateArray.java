package Arrays;

class RotateArray {

    // my soltuion - 1ms 
    // static void rotate(int[] nums, int k) {
    //     int len = nums.length;
    //     int[] res = new int[len];
        
    //     for (int i = 0; i < len; i++) {
    //         int newIndex = (i + k) % len;
    //         res[newIndex] = nums[i];
    //     }
        
    //     System.arraycopy(res, 0, nums, 0, len);
    //     for (int i : res) {
    //         System.out.print(i+" ");
    //     }
    // }

    //solution 2 - 0ms
    static void rotate(int[] nums, int k)
    {
        int len = nums.length;
        k%=len;

        reverseNum(nums,0,len-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,len-1);

        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
    static void reverseNum(int[] nums,int start, int end)
    {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        rotate(new int[] {1,23,4,5,6,7},3);
    }
}