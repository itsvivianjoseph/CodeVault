package Strings;

// my solution - 13 ms
public class LongestSubstringWithoutRepeatingCharacters {
    
    static int lengthOfLongestSubstring(String s) {

        if( s.equals(" ") || s.length()==1 ) return 1;

        String substr = "";
        int max = 0, count = 0, len = s.length();

        for (int i = 0; i < len; i++) 
        {
            if (substr.contains(String.valueOf(s.charAt(i)))) 
            {
                if (substr.charAt(0) == s.charAt(i)) 
                {
                    substr = substr.substring(1);
                    substr += s.charAt(i);
                } 
                else 
                {
                    if (count > max) max = count;
                    int index = substr.indexOf(s.charAt(i));
                    substr = substr.substring(index + 1) + s.charAt(i);
                    count = substr.length();
                }
            } 
            else 
            {
                substr += s.charAt(i);
                count++;
            }
        }

        return Math.max(max, count);

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ohvhjdml"));
    }
}


//sliding window - 5ms
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         Set<Character>set=new HashSet<>();
//         int maxLength=0;
//         int left=0;
//         for(int right=0;right<s.length();right++){
           
//             if(!set.contains(s.charAt(right))){
//                 set.add(s.charAt(right));
//                 maxLength=Math.max(maxLength,right-left+1);
                
//             }else{
//                 while(s.charAt(left)!=s.charAt(right)){
//                     set.remove(s.charAt(left));
//                     left++;
//                 }
//                 set.remove(s.charAt(left));left++;
//                 set.add(s.charAt(right));
//             }
            
//         }
//         return maxLength;
//     }
// }


//gpt solution using arrays - 2ms
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int max = 0;
//         int len = s.length();
//         int[] charIndex = new int[256]; 

//         for (int i = 0; i < 256; i++) {
//             charIndex[i] = -1;
//         }

//         int start = 0; 

//         for (int i = 0; i < len; i++) {
//             if (charIndex[s.charAt(i)] >= start) {
//                 start = charIndex[s.charAt(i)] + 1;
//             }
            
//             charIndex[s.charAt(i)] = i;
            
//             int currentLength = i - start + 1;
            
//             if (currentLength > max) {
//                 max = currentLength;
//             }
//         }

//         return max;

//     }
// }