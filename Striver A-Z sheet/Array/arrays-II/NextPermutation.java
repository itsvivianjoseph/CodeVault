public class NextPermutation {
    static void nextPermutation(int[] nums){
        int idx = -1;
        int len = nums.length;
        for(int i = len-2;i >= 0;i--){
            if(nums[i] < nums[i+1]) {
                idx = i;
                break;
            } 
        }

        if(idx == -1){
            reverse(nums,0,len-1,len);
            return;
        }

        for(int i = len-1;i>=0;i--){
            if(nums[i] > nums[idx]){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                reverse(nums, idx+1, len-1, len);
                break;
            }
        }

    }
    static void reverse(int[] nums,int left,int right,int len){
        
        while(left < right && left < len && right >= 0){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--; 
        }

    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }    
}
