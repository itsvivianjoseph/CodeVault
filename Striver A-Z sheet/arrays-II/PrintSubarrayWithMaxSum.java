// ext version of kadanes algo
public class PrintSubarrayWithMaxSum {
    static int[] findMaxsubarray(int[] nums){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            end = i;
            if(sum < 0) {
                sum = 0;
                start = i;
            }
            maxSum = Math.max(maxSum,sum);
        }
        return new int[] {start,end,maxSum};
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5};
        int[] idxs = findMaxsubarray(nums);
        System.out.println("max sum : "+idxs[2]);
        for(int i=idxs[0];i<idxs[1];i++) System.out.print(nums[i] + " ");
    }    
}