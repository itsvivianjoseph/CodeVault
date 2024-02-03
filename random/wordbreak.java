import java.util.HashSet;
import java.util.Set;

public class wordbreak {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("sam");
        dictionary.add("sung");
        dictionary.add("samsung");
        dictionary.add("mobile");
        dictionary.add("ice");
        dictionary.add("cream");
        dictionary.add("icecream");
        dictionary.add("man");
        dictionary.add("go");
        dictionary.add("mango");

        String input1 = "ilike";
        String input2 = "ilikesamsung";

        System.out.println("Can segment '" + input1 + "': " + canSegment(input1, dictionary)); // Output: true
        System.out.println("Can segment '" + input2 + "': " + canSegment(input2, dictionary)); // Output: true
        // int n = 5;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print(".");
        //     }
        //     for (int j = 0; j < 2 * i + 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = n - 2; i >= 0; i--) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print(".");
        //     }
        //     for (int j = 0; j < 2 * i + 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    }

    // public static boolean canSegment(String input, Set<String> dictionary) {
    //     int n = input.length();
    //     boolean[] canSegment = new boolean[n + 1];
    //     canSegment[0] = true;

    //     for (int end = 1; end <= n; end++) {
    //         for (int start = 0; start < end; start++) {
    //             String substring = input.substring(start, end);
    //             if (canSegment[start] && dictionary.contains(substring)) {
    //                 canSegment[end] = true;
    //                 System.out.println("Segmented substring '" + substring + "' at index " + end);
    //                 break;
    //             }
    //         }
    //     }

    //     return canSegment[n];
    // }

    static boolean canSegment(String input, Set<String> set) {
        int lastbrkpt = 0;

        for (int brkpt = 1; brkpt <= input.length(); brkpt++) {
            String str = input.substring(lastbrkpt, brkpt);
            if (set.contains(str)) {
                lastbrkpt = brkpt;
            }
        }

        return lastbrkpt == input.length();
    }
}