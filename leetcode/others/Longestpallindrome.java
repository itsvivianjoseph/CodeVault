package others;

public class Longestpallindrome {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) if(c >= 0 && c <= 127 && Character.isLetterOrDigit(c)) freq[c]++;
        int max = 0;
        boolean oneOdd = false;
        for(int i=0;i<128;i++){
            if(freq[i]%2==0) max+=freq[i];
            else {
                max += freq[i]-1;
                oneOdd = true;
            }
        }
        if(oneOdd) max+=1;
        return max;
    }

}
