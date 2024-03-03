import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String ip1 = get.nextLine();         
        String ip2 = get.nextLine();    
        System.out.println(lexOrder(ip1, ip2));     
        get.close();
    }

    static String lexOrder(String one, String two) {
        for (int i = 0; i < one.length(); i++) {
            char charOne = Character.toLowerCase(one.charAt(i));
            char charTwo = Character.toLowerCase(two.charAt(i));

            if (charOne < charTwo) {
                return "-1";
            } else if (charOne > charTwo) {
                return "1";
            }
        }

        return "0";
    }
}