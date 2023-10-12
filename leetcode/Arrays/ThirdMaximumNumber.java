package Arrays;

public class ThirdMaximumNumber {
    // new sol
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num < firstMax && num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num < secondMax && num > thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == Long.MIN_VALUE) {
            return (int) firstMax;
        } else {
            return (int) thirdMax;
        }
    }
}
