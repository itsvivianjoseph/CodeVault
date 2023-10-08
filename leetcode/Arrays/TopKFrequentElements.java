// not fully coded
package Arrays;


class TopKFrequentElements{
    static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int candidate = nums[0];
        int idx=0;
        int count = 0;
        int maxcount = 0;
        for(int i = 1; i < nums.length; i++) {
            if (count == k && count>=maxcount) {
                res[idx++] = candidate;
                maxcount = count;
            }
            if (nums[i] == candidate) {
                count++;
            } else if (nums[i] != candidate) {
                candidate = nums[i];
                count=1;
            }
        }
        // for(int i =0;i<res.length;i++) System.out.println(res[i]);
        return res;
    }
    public static void main(String[] args) {
        topKFrequent(new int[] {1,1,1,2,2,3}, 2);
    }
}