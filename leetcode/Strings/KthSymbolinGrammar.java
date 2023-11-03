package Strings;

public class KthSymbolinGrammar {
    public int kthGrammar(int n, int k) {
        if (n == 1 || k == 1) return 0;
        return Integer.bitCount(k - 1) % 2;
    }
}
