import java.util.HashSet;

class LongestConsecutiveSequence{
    static int longestConsecutiveSequence(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        for(Integer i : set){
            int prev = i-1;
            count = 1;
            while (set.contains(prev)) {
                count++;
                prev--;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    } 
    public static void main(String[] args) {
        int[] nums = {3, 8, 5, 7, 6};
        System.out.println(longestConsecutiveSequence(nums));
    }
}