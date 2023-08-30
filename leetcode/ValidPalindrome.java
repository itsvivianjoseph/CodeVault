public class ValidPalindrome {
    static boolean isPalindrome(String s) {
        
        if (s == null) return false;
        if(s.equals(" ")) return true;
        
        s = s.toLowerCase();
        
        StringBuilder cleanString = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanString.append(c);
            }
        }
        
        String cleaned = cleanString.toString();
        int left = 0, right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
// public static String removeSpaces(String input) {
//     char[] charArray = input.toCharArray();
//     int length = charArray.length;
    
//     int newIndex = 0; 
    
//     for (int i = 0; i < length; i++) {
//         if (charArray[i] != ' ') {
//             charArray[newIndex] = charArray[i];
//             newIndex++;
//         }
//     }
    
//     return new String(charArray, 0, newIndex);
// }

// static char[] toLowerCase(String s)
// {
//     s = removeSpaces(s);
//     char[] str = s.toCharArray();
//     for(int i=0;i<str.length;i++)
//     {
//         int letter = str[i];
//         if(letter>=97 && letter<=122) continue;
//         else {
//             letter+=32;
//             str[i] = (char)letter;
//         }
//     }
//     return str;
// }