package Strings;

public class ValidAnagram {
    static boolean isAnagram(String s, String t) 
    {

    if(s.length()!=t.length()) return false;

    int[] freqs = new int[26];
    int[] freqt = new int[26];

    for (char c : s.toCharArray()) {
        freqs[c - 'a']++;
    }

    for (char c : t.toCharArray()) {
        freqt[c - 'a']++;
    }

    for(int i=0;i<26;i++)
    {
        if(freqs[i]!=freqt[i]) return false; 
    }

    return true;
}
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }   
}

// import java.util.Arrays;
//   static boolean isSame(char[] one,char[] two)
//     {
//         if(one.length!=two.length) return false;
//         Arrays.sort(one);
//         Arrays.sort(two);
//         for(int i=0;i<one.length;i++) {
//             if(one[i]==two[i]) continue;
//             else return false;
//         }
//         return true;
//     } 
//     static boolean isAnagram(String s, String t) {
//         char[] one = s.toCharArray();
//         char[] two = t.toCharArray();
//         return isSame(one,two);
//     }
