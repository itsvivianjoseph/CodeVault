public class CountBits {
    static int ToBinary(int a)
    {
        if(a==0) return 0;
        int count = 0;
        String bin = Integer.toBinaryString(a);
        for(int i=0;i<bin.length();i++) {
            if(bin.charAt(i)=='1') count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0;i<res.length;i++)
        {
            res[i] = ToBinary(i);
        }
        return res;
    }
}