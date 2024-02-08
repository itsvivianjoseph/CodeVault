public class SecondLargest {
    static int findSecLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest) {
                sec_largest = largest;
                largest = nums[i];
            }
            if(nums[i] > sec_largest && nums[i] != largest) sec_largest = nums[i];
        }
        return sec_largest;
    }

    public static void main(String[] args) {
        int sec_largest = findSecLargest(new int[] {1,2,3,4,5});
        System.out.println(sec_largest);
    }    
}
