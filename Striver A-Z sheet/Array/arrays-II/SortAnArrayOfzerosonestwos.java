public class SortAnArrayOfzerosonestwos {
    static void sort(int[] nums){
        int zeros = 0;
        int ones = 0;
        for(int i : nums){
            if(i==0) zeros++;
            if(i==1) ones++;
        }
        for(int i=0;i<zeros;i++) nums[i] = 0;
        for(int i=zeros;i<zeros+ones;i++) nums[i] = 1;
        for(int i=ones+zeros;i<nums.length;i++) nums[i] = 2;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,2,1};
        sort(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }    
}
