class Tribonacci {
    public static int tribonacci(int n) {
        int[] sum = {0};
        return Tri(n, new HashMap<>(), sum);
    }

    public static int Tri(int n, HashMap<Integer, Integer> memo, int[] sum) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (memo.containsKey(n)) {
            sum[0] += memo.get(n);
            return memo.get(n);
        }
        int result = Tri(n - 1, memo, sum) + Tri(n - 2, memo, sum) + Tri(n - 3, memo, sum);
        sum[0] += result;
        memo.put(n, result);
        return result;
    }
}
