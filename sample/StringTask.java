import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String input = get.nextLine();
        System.out.println(stringTask(input));
        get.close();
    }

    static String stringTask(String input) {
        if (input.isEmpty()) {
            return input;
        }

        input = input.toLowerCase();
        StringBuilder res = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!isVowel(c)) {
                res.append('.').append(c);
            }
        }

        return res.toString();
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }
}
