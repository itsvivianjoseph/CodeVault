import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String input = get.nextLine();
        System.out.println(wordCapitalization(input));
        get.close();
    }

    static String wordCapitalization(String input) {
        if (input.isEmpty()) {
            return input; 
        }

        String res = "";

        if (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') {
            return input; 
        } else {
            char c = (char) (input.charAt(0) - 32);
            res += c;
        }
        for (int i = 1; i < input.length(); i++) {
            res += input.charAt(i);
        }
        return res;
    }
}
