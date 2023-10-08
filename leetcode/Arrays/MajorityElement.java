package Arrays;

class MajorityElement {
    static int majorityElement(int[] nums) {  
        int candidate = nums[0]; 
        int count = 1; 

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == candidate) count++;
            else count--;

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }

        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,4,4,5};
        System.out.println(majorityElement(arr));
//                 HashMap<String,Integer> hm = new HashMap<String,Integer>();
// hm.containsKey(hm)
    }   
}