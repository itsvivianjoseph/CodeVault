package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurences {
        public boolean uniqueOccurrences(int[] arr)
    {
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int x : arr){
            hs.put(x,1+hs.getOrDefault(x,0));
        }
        return hs.size() == new HashSet<>(hs.values()).size();
    }

}
