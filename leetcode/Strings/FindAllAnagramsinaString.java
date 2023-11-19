package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

class FindAllAnagramsinaString{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int Slen = s.length();
        int Plen = p.length();
        if (Plen > Slen) return res;
        HashMap<Character, Integer> Pcount = new HashMap<>();
        HashMap<Character, Integer> Scount = new HashMap<>();
        // initializing the window
        for (int i = 0; i < Plen; i++) {
            char pChar = p.charAt(i);
            char sChar = s.charAt(i);
            Pcount.put(pChar, Pcount.getOrDefault(pChar, 0) + 1);
            Scount.put(sChar, Scount.getOrDefault(sChar, 0) + 1);
        }
        // compare the maps
        if (Objects.equals(Pcount, Scount)) res.add(0);
        // slide the window through the s
        int left = 0;
        for (int i = Plen; i < Slen; i++) {
            char c = s.charAt(i);
            char leftChar = s.charAt(left);
            Scount.put(c, Scount.getOrDefault(c, 0) + 1);
            Scount.put(leftChar, (Scount.get(leftChar) - 1));
            if (Scount.get(leftChar) == 0) Scount.remove(leftChar);
            left += 1;
            if (Objects.equals(Pcount, Scount)) res.add(left);
        }
        return res;
    }
}
// public static boolean areEqual(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
//     if (map1 == null && map2 == null) {
//         return true;
//     }

//     if (map1 == null || map2 == null) {
//         return false;
//     }

//     if (map1.size() != map2.size()) {
//         return false;
//     }

//     for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
//         Character key = entry.getKey();
//         Integer value1 = entry.getValue();
//         Integer value2 = map2.get(key);

//         if (value2 == null || !value1.equals(value2)) {
//             return false;
//         }
//     }
//     return true;
// }