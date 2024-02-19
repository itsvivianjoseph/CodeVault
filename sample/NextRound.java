import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int advancers = 0;
        int kthPlaceScore = scores[k - 1];

        for (int score : scores) {
            if (score >= kthPlaceScore && score > 0) {
                advancers++;
            }
        }

        System.out.println(advancers);

        scanner.close();
    }
}