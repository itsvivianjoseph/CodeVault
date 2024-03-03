import java.util.*;

public class LargestNumberformedfromanArray {
    String printLargest(int n, String[] nums) {
        HashMap<Integer, List<String>> hm = new HashMap<>();

        for (String num : nums) {
            int lastDigit = num.charAt(0) - '0';

            List<String> currentList = hm.getOrDefault(lastDigit, new ArrayList<>());
            currentList.add(num);
            hm.put(lastDigit, currentList);
        }

        StringBuilder res = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            List<String> values = hm.get(i);
            if (values != null) {
                values.sort((a, b) -> (b + a).compareTo(a + b));
                for (String value : values) {
                    res.append(value);
                }
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        LargestNumberformedfromanArray obj = new LargestNumberformedfromanArray();
        // String result = obj.printLargest(5, new String[]{"3", "30", "34", "5", "9"});
        String result = obj.printLargest(5, new String[] {"54", "546", "548", "60"});
        System.out.println(result);
    }
}
