package Strings;
class IsSubsequence
{
    static boolean isSubseq(String s, String t) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch-'a']++;
        }
        for (char ch : t.toCharArray()) {
            arr[ch-'a']++;
        }

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==2) count++;
        }
        return (count==s.length()) ? true : false;
    }

    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        System.out.println(isSubseq(s,t));
    }
}