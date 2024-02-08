public class MissingNumber {
    static int findMissingNumber(int[] nums){
        int len = nums.length;

        int xor = 0;
        for(int i=1;i<=len+1;i++) xor ^= i;
        for (int i : nums) xor ^= i;

        return xor;
    }
    // static int findMissingNumber(int[] nums){
    //     int len = nums.length+1;

    //     int totSum = ((len*(len+1))/2);
    //     System.out.println(totSum);

    //     for(int i : nums) totSum -= i;

    //     return totSum;
    // }
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        System.out.println("the missing number is : " + findMissingNumber(nums));
    }    
}
