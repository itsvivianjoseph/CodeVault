import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int posi = -1;
        int posj = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = get.nextInt();
                if (matrix[i][j] == 1) {
                    posi = i;
                    posj = j;
                }
            }
        }
        System.out.println(calc(matrix, posi, posj));
    }

    static int calc(int[][] matrix, int i, int j) {
        int moves = 0;
        if ((i + 1) == 3 && (j + 1) == 3) return moves;
        else {
            // row
            if ((i + 1) > 3) moves += ((i + 1) - 3);
            else if ((i + 1) < 3) moves += (3 - (i + 1));
            else moves += 0;
            // column
            if ((j + 1) > 3) moves += ((j + 1) - 3);
            else if ((j + 1) < 3) moves += (3 - (j + 1));
            else moves += 0;
        }
        return moves;
    }
}