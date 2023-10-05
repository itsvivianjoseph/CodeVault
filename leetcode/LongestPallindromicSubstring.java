public class LongestPallindromicSubstring {
    static String longestPalindrome(String s) {

        if(s==null || s.length()<1) return "";

        int len = 0;
        int start = 0 , end = 0;
        for(int i=0;i<s.length();i++)
        {
            int len1 = expandCenter(s,i,i);
            int len2 = expandCenter(s,i,i+1);
            len = Math.max(len1, len2);
            if(len > (end-start)){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end + 1);
    }
    static int expandCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(right)==s.charAt(left)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababd"));
    }
}