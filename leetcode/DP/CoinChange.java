import java.util.*;

class CoinChange {
    static int min = Integer.MAX_VALUE - 1;

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int amount = 4;
        System.out.println(coinChanges(amount, nums));
    }

    static int coinChanges(int amt, int[] nums) {
        return coinChange(amt, nums, new HashMap<>());
    }
    
    static int coinChange(int amt, int[] nums, HashMap<Integer, Integer> memo) 
    {
        if (amt == 0) {
            return 0;
        }
        if (amt < 0) {
            return Integer.MAX_VALUE - 1;
        }
        if (memo.containsKey(amt)) {
            return memo.get(amt);
        }

        for (int num : nums) {
            int subAmt = amt - num;
            min = Math.min(min, coinChange(subAmt, nums, memo) + 1);
        }

        memo.put(amt, min);

        return min;
    }
}
