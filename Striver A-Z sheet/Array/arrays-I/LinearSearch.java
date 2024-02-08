public class LinearSearch {
    static boolean find(int[] nums,int key){
        for(int i=0;i<nums.length;i++) if(nums[i] == key) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println("is Element Found ? "+ (find(new int[] {1,2,3,4,5}, 5) ? "yes" : " no"));
    }    
}