//not working

public class LongestPallindromeSubString {
    static String palindrome(String str)
    {
        if(str==null || str.length()<1) return "";

        int start=0,end=0;

        for(int i=0;i<str.length();i++)
        {
            int len1 = expand(str,i,i);
            int len2 = expand(str,i,i+1);
            int len = Math.max(len1, len2);
            if(len>end-start){
                start = i-((len-1)/2);
                end = i+(len/2);
            }
            return str.substring(start, end);
        }

        return str;
    }
    static int expand(String str,int left,int right){
        if(str==null || left>right){ return 0;}

        while(left>=0 && right<str.length() && str.charAt(right)==str.charAt(left)){
            left--;
            right++;
        }

        return right-left-1;
    } 
    public static void main(String[] args) {
        // String str = ;
        System.out.println(palindrome("racecar"));
    }
}
