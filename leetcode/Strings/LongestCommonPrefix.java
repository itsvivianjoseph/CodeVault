package Strings;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
    
        String shortest = strs[0];
        for (String str : strs) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
    
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < shortest.length(); i++) {
            char currentChar = shortest.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }
    
        return commonPrefix.toString();
    }
    
}
// static void update(HashMap<Character, Integer> hm, String str) {
//     for (char c : str.toCharArray()) hm.put(c, hm.getOrDefault(c, 0) + 1);
// }

// public String longestCommonPrefix(String[] strs) {
//     HashMap<Character, Integer> hm = new HashMap<>();
//     int len = strs.length;

//     for (int i = 0; i < len; i++) {
//         update(hm, strs[i]);
//     }

//     StringBuilder str = new StringBuilder();
//     for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//         Character key = entry.getKey();
//         Integer value = entry.getValue();
//         if (value >= len) {
//             str.append(key);
//         }
//     }

//     return str.toString();
// }