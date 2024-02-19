import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        get.nextLine(); 
        List<String> ip = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = get.nextLine();
            ip.add(input);
        }

        checkTooLong(ip);
    }

    static void checkTooLong(List<String> ip) {
        for (String curr : ip) {
            int len = curr.length();
            if (len > 10) {
                StringBuilder modified = new StringBuilder();
                modified.append(curr.charAt(0)).append(len - 2).append(curr.charAt(len - 1));
                System.out.println(modified);
            } else {
                System.out.println(curr);
            }
        }
    }
}
