// my solution
public class LongestSubstringWithoutRepeatingCharacters {
    
    static int lengthOfLongestSubstring(String s) {
        
        String substr = "";
        int max = 0, count = 0, len = s.length();

        for (int i = 0; i < len; i++) {
            if (substr.contains(String.valueOf(s.charAt(i)))) {
                if (substr.charAt(0) == s.charAt(i)) {
                    substr = substr.substring(1);
                    substr += s.charAt(i);
                } else {
                    if (count > max) max = count;
                    int index = substr.indexOf(s.charAt(i));
                    substr = substr.substring(index + 1) + s.charAt(i);
                    count = substr.length();
                }
            } else {
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


// my solution
// public class LongestSubstringWithoutRepeatingCharacters {

//     static int lengthOfLongestSubstring(String s) {
        
//         String substr="";
//         int max = 0 , count=0 , len = s.length();

//         for(int i=0;i<len;i++)
//         {
//             if(substr.contains(String.valueOf(s.charAt(i)))) {
//                if(substr.charAt(0)==s.charAt(i)){
//                 substr = substr.substring(1);
//                 substr+=s.charAt(i);
//                }
//                else{
//                 if(max<count) max = count;
//                 substr = "";
//                 substr+=s.charAt(i);
//                 count = 1;
//                }
//             }
//             else {
//                 substr+=s.charAt(i);
//                 count++;
//             }
//         }
        
//         return max>count ? max : count;
//     }

//     public static void main(String[] args) {
//         System.out.println(lengthOfLongestSubstring("ohvhjdml"));
//     }
// }





//not my solution - gpt
// public class LongestSubstringWithoutRepeatingCharacters {

//     static int lengthOfLongestSubstring(String s) {
//         int max = 0;
//         int len = s.length();
//         int[] charIndex = new int[256]; // Assuming ASCII characters

//         // Initialize the charIndex array with -1 (indicating characters not seen yet)
//         for (int i = 0; i < 256; i++) {
//             charIndex[i] = -1;
//         }

//         int start = 0; // Starting index of the current substring

//         for (int i = 0; i < len; i++) {
//             // Check if the current character has been seen in the current substring
//             if (charIndex[s.charAt(i)] >= start) {
//                 start = charIndex[s.charAt(i)] + 1; // Move the start to the next index
//             }
            
//             // Update the index of the current character
//             charIndex[s.charAt(i)] = i;
            
//             // Calculate the length of the current non-repeating substring
//             int currentLength = i - start + 1;
            
//             // Update the maximum length if needed
//             if (currentLength > max) {
//                 max = currentLength;
//             }
//         }

//         return max;
//     }

//     public static void main(String[] args) {
//         System.out.println(lengthOfLongestSubstring("aab"));
//     }
// }
