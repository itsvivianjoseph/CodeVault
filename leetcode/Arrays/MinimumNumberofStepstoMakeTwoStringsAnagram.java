// incomplete
package Arrays;

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map.Entry;

public class MinimumNumberofStepstoMakeTwoStringsAnagram {
    public static void main(String[] args) {
        int[] freq = new int[26];
        String s = "leetcode";
        String t = "practice";
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            freq[c - 'a']--;
        }
        for(int i=0; i<26; i++){
            System.out.println((char)(i + 'a') + " : " + freq[i]);
        }
    }

    // public static void main(String[] args) {
    //     HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    //     HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    //     String s = "gctcxyuluxjuxnsvmomavutrrfb";
    //     String t = "qijrjrhqqjxjtprybrzpyfyqtzf";

    //     for (char c : s.toCharArray()) {
    //         hm.put(c, hm.getOrDefault(c, 0) + 1);
    //     }
    //     for (char c : t.toCharArray()) {
    //         hm.put(c, hm.getOrDefault(c, 0) - 1);
    //     }
    //     for (Entry<Character, Integer> entry : hm.entrySet()) {
    //         Character key = entry.getKey();
    //         Integer value = entry.getValue();
    //         count.put(value, count.getOrDefault(value, 0) + 1);
    //     }

    //     System.out.println("Sorted String s: " + sortString(s));
    //     System.out.println("Sorted String t: " + sortString(t));

    //     for(Entry<Integer,Integer> entry : count.entrySet()){
    //         Integer key = entry.getKey();
    //         Integer value = entry.getValue();
    //         System.out.println("Key: " + key + ", Value: " + value);
    //     }
    // }
    // private static String sortString(String input) {
    //     char[] charArray = input.toCharArray();
    //     Arrays.sort(charArray);
    //     return new String(charArray);
    // }
}