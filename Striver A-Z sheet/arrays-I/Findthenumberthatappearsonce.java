public class Findthenumberthatappearsonce {
    static int findMissingNumber(int[] nums){
        int xor = 0;
        for (int i : nums) xor ^= i;
        return xor;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        System.out.println(findMissingNumber(nums));
    }    
}