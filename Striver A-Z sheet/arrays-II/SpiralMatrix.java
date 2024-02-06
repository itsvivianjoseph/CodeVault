public class SpiralMatrix {
    static void printSpiralMatrix(int[][] matrix) {
        int len = matrix.length;
        int top = 0;
        int left = 0;
        int right = len - 1;
        int bottom = len - 1;
        // int num = 1; 
        
        // int[][] spiral = new int[len][len];

        for (int x=0;x<len*len;x++) {
            for (int i = left; i <= right; i++) {
                // spiral[top][i] = num++;
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                // spiral[i][right] = num++;
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            
            for (int i = right; i >= left; i--) {
                // spiral[bottom][i] = num++;
                System.out.print(matrix[bottom][i]+" ");
            }
            bottom--;
            
            for (int i = bottom; i >= top; i--) {
                // spiral[i][left] = num++;
                System.out.print(matrix[i][left]+" ");
            }
            left++;
        }

        // // Print the spiral matrix
        // for (int i = 0; i < len; i++) {
        //     for (int j = 0; j < len; j++) {
        //         System.out.print(spiral[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiralMatrix(matrix);
    }
}