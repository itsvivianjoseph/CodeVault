public class RotateByNintyDegrees {
    static void rotateByNintyDegrees(int[][] matrix){
        int len = matrix.length;
        for(int j=0;j<len;j++)
        {
            for(int i = len-1; i>=0 ; i--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},
                          {2,4,8,10},
                          {13,3,6,7},
                          {15,14,12,16}
                        };
        rotateByNintyDegrees(matrix);
    }    
}