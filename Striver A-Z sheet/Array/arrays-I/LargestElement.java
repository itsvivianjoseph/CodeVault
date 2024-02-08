public class LargestElement {
    static int findLargest(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) max = Math.max(max, nums[i]);
        return max;
    }
    public static void main(String[] args) {
        int largest = findLargest(new int[] {1,2,3,4,5});
        System.out.println(largest);
    }
}
