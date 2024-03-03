import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String input = get.nextLine();
        System.out.println(changeOrder(input));
        get.close();
    }
    static String changeOrder(String input){
        int len = input.length();
        if(len == 1) return input;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            char c = input.charAt(i);
            if(c != '+' && c != '-'){
                res.add(c-'0');
            }
        }
        Collections.sort(res);
        String ans = "";
        ans += Integer.toString(res.get(0));
        for (int i=1;i<res.size();i++) {
            ans += "+" + Integer.toString(res.get(i));
        }
        return ans;
    }

}