import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String input = get.nextLine();
        System.out.println(boyOrGirl(input)); 
    }
    static String boyOrGirl(String input){
        int[] freq = new int[26];
        for (char c : input.toCharArray()) {
            freq[c-'a']++;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(freq[i] != 0) count++; 
        }
        return count % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!";
    }
}