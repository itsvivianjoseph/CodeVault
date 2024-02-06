package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinimumNumberofOperationstoMakeArrayEmpty {
        public int minOperations(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int op = 0;

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int value = entry.getValue();

            if (value < 2) {
                return -1;
            } else {
                op += findNumberOfOperations(value);
                iterator.remove();
            }
        }

        return hm.isEmpty() ? op : -1;
    }
    static int findNumberOfOperations(int num) {
        if (num % 3 == 0) {
            return num / 3;
        }
        int twos = 0, threes = 0;
        while (num != 0) {
            num -= 2;
            twos += 1;
            if (num % 3 == 0) {
                threes += (num / 3);
                break;
            }
        }
        return twos + threes;
    }
}