package Arrays;

import java.util.HashMap;

public class MostFrequentEvenNumber {
        public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        int maxfreq = 0;
        int element = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0) {
                int curr = hm.getOrDefault(nums[i],0)+1;
                hm.put(nums[i],curr);
                if(curr>maxfreq || (curr==maxfreq && nums[i]<element)){
                    maxfreq = curr;
                    element = nums[i];
                } 
            }
        }

        return maxfreq==0 ? -1 : element;
    }
}
