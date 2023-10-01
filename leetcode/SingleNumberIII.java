public class SingleNumberIII {
    static int[] findSingleNumber(int[] nums){

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find the rightmost set bit in the XOR result
        int rightmostSetBit = 1;
        while ((xor & rightmostSetBit) == 0) {
            rightmostSetBit <<= 1;
        }

        // Step 3: Initialize two variables to track the two unique numbers
        int num1 = 0;
        int num2 = 0;

        // Step 4: Divide the numbers into two groups based on the rightmost set bit
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }
}