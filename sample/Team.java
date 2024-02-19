import java.util.*;

public class Team {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int n = get.nextInt();
        int[][] matrix = new int[n][3];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = get.nextInt();
            }
        }
        
        System.out.println(calc(matrix));
    }
    static int calc(int[][] input){
        int solved = 0;
        for(int i=0;i<input.length;i++){
            int count = 0;
            for(int j=0;j<input[i].length;j++){
                if(input[i][j] == 1) count++;
                if(count >= 2) {
                    solved++;
                    break;
                }
            }
            count = 0;
        }
        
        return solved;
    }
}