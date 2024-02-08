class CheckiftwoStringsareanagramsofeachother{
    static boolean isAnagrams(String one,String two){
        int[] freq = new int[26];
        for (char c : one.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : two.toCharArray()) {
            freq[c - 'a']--;
        }

        for(int i : freq) if(i != 0) return false;
        
        return true;
    }
    public static void main(String[] args) {
        String ip1 = "CAT";
        String ip2 = "TAC";
        System.out.println("given 2 strings are " + (isAnagrams(ip1.toLowerCase(), ip2.toLowerCase()) ? "anagrams" : "not anagrams"));
    }
}