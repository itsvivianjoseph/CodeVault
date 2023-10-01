import java.util.HashMap;
import java.util.Map;

class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int res = 0;
        int maxCount = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            count.put(c, count.getOrDefault(c, 0) + 1);
            maxCount = Math.max(maxCount, count.get(c));

            while (end - start + 1 - maxCount > k) {
                char leftChar = s.charAt(start);
                count.put(leftChar, count.get(leftChar) - 1);
                start++;
            }

            res = Math.max(res, end - start + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        String s = "ABAB";
        int k = 2;
        int result = solution.characterReplacement(s, k);
        System.out.println(result); 
    }
}
