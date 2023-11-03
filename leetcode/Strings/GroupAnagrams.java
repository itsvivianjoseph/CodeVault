package Strings;

import java.util.*;

public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        int len = strs.length;

        if (len == 0) {
            return res;
        }

        if (len == 1) {
            res.add(Arrays.asList(strs[0]));
            return res;
        }

        for (int i = 0; i < len; i++) {
            boolean match = false;
            for (int j = 0; j < res.size(); j++) {
                match = findMatch(strs[i], res.get(j).get(0));
                if (match) {
                    res.get(j).add(strs[i]);
                    break;
                }
            }
            if (!match) {
                res.add(new ArrayList<>(Arrays.asList(strs[i])));
            }
        }

        return res;
    }

    static boolean findMatch(String str, String anagram) {
        int len = str.length();
        if (len == anagram.length()) {
            int[] freq = new int[26];
            for (int i = 0; i < len; i++) {
                char c = str.charAt(i);
                freq[c - 'a']++;
                c = anagram.charAt(i);
                freq[c - 'a']--;
            }
            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
