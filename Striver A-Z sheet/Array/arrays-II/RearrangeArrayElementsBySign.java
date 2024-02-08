import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsBySign {
    static int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positive and negative elements into two lists
        for (int i : nums) {
            if (i > 0) pos.add(i);
            else neg.add(i);
        }

        int idx = 0;

        // Check which type of element (positive or negative) should start
        if (pos.size() > neg.size()) {
            // Fill the array with positive elements at even indices
            for (Integer i : pos) {
                if (idx < nums.length) {
                    nums[idx] = i;
                    idx += 2;
                }
            }
            // Reset index for negative elements starting at odd indices
            idx = 1;
            // Fill the array with negative elements at odd indices
            for (Integer i : neg) {
                if (idx < nums.length) {
                    nums[idx] = i;
                    idx += 2;
                }
            }
        } else {
            // Fill the array with negative elements at even indices
            for (Integer i : neg) {
                if (idx < nums.length) {
                    nums[idx] = i;
                    idx += 2;
                }
            }
            // Reset index for positive elements starting at odd indices
            idx = 1;
            // Fill the array with positive elements at odd indices
            for (Integer i : pos) {
                if (idx < nums.length) {
                    nums[idx] = i;
                    idx += 2;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -4, -5, 3, 4};
        int[] res = rearrangeArray(nums);

        // Print the rearranged array
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
