package Strings;

public class KthGrammar {
    // my approach 
    static int kthGrammarele(int n, int k) {
        if(n==1 || k==1) return 0;
        StringBuilder res = new StringBuilder("0");
        int idx = 0;
        long limit = ((long) Math.pow(2, n));

        while (res.length() < (limit - 1)) {
            if (res.charAt(idx) == '0') {
                res.append("01");
            } else {
                res.append("10");
            }
            idx++;
        }
        idx = ((int)Math.pow(2, n - 1)) + (k-1);
        return res.charAt(idx-1) == '1' ? 1 : 0;
    }
    // gpt approach 
    static int kthGrammarele2(int n, int k) {
        if (n == 1 || k == 1) return 0;
        return Integer.bitCount(k - 1) % 2;        
    }
    public static void main(String[] args) {
        System.out.println(kthGrammarele(4,4));
    }
}
