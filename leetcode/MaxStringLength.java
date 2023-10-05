public class MaxStringLength {
    public static void main(String[] args) {
        int maxLength = 2147483647;
        StringBuilder builder = new StringBuilder(maxLength);
        for (int i = 0; i < maxLength; i++) {
            builder.append('a');
        }
        String a = builder.toString();
        System.out.println(a);
    }
}
