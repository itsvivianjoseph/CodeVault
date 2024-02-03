public class spiral {
    public static void main(String[] args) {
        int ip = 4;
        int upper = 0;
        int left = 0;
        int right = 4;
        int lower = 4;
        int[][] mat = new int[4][4];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                // if(i == upper) mat[upper][j] = ip;
                // if(left == j) mat[i][left] = ip;
                // if(right == j) mat[i][right] = ip;
                // if(i == lower) mat[lower][j] = ip; 
                mat[upper][j] = ip;
                mat[i][left] = ip;
                mat[i][right] = ip;
                mat[lower][j] = ip; 
            }
            
            upper++;
            left++;
            right--;
            lower--;
            ip--;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}