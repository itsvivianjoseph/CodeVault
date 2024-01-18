package Strings;

public class DetermineifStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int count = 0;

        for (int i = 0; i < mid; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(mid + i);

            if (isVowel(c1))
                count++;
            if (isVowel(c2))
                count--;
        }

        return count == 0;
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
