package Strings;

import java.util.ArrayList;
import java.util.List;

public class CountandSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        List<String> res = new ArrayList<String>();
        res.add("1");
        for (int i = 1; i < n; i++) {
            List<int[]> curr = findCount(res.get(i - 1));
            res.add(findSay(curr));
        }
        return res.get(res.size() - 1);
    }

    static List<int[]> findCount(String ip) {
        List<int[]> counts = new ArrayList<int[]>();
        int idx = 0;
        int count = 1;
        for (int i = 1; i < ip.length(); i++) {
            if (ip.charAt(i) == ip.charAt(idx)) count++;
            else {
                counts.add(new int[]{ip.charAt(idx), count});
                idx = i;
                count = 1;
            }
        }
        counts.add(new int[]{ip.charAt(idx), count});
        return counts;
    }

    static String findSay(List<int[]> counts) {
        StringBuilder say = new StringBuilder();
        for (int i = 0; i < counts.size(); i++) {
            say.append(counts.get(i)[1]);
            say.append((char) counts.get(i)[0]);
        }
        return say.toString();
    }
}
