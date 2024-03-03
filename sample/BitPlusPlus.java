import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        get.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(get.next());
        }
        if (list.size() >= 1) {
            System.out.println(bitPlusPlus(list));
        } else {
            System.out.println("the string list is empty!");
        }
        get.close();
    }
    static int bitPlusPlus(List<String> list) {
        int x = 0;
        for (String ele : list) {
            if (ele.charAt(1) == '-') {
                x--;
            } else {
                x++;
            }
        }
        return x;
    }
}