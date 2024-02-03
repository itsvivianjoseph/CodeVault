public class sortdecfreq {
    public static void main(String[] args) {
        int[] nums = {0,-1,2,1,0};

        // Step 1: Count frequency using a HashMap
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
            minElement = Math.min(minElement, num);
        }

        int[] frequency = new int[maxElement - minElement + 1];

        for (int num : nums) {
            frequency[num - minElement]++;
        }

        // Step 2: Iterate over the frequency array and print elements
        for (int i = maxElement - minElement; i >= 0; i--) {
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print(i + minElement + " ");
            }
        }
    }
}
