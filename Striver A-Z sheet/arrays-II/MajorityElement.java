public class MajorityElement {
    static int majorityElement(int[] nums){
        int count = 0;
        int candidate = 0;
        for(int i : nums){
            if(count == 0){
                candidate = i;
                count = 1;
            }
            else if(candidate == i) count++;
            else count--;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    
    }    
}
