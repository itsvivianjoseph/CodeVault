class setZeros
{
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int[] idx = {0,3};

        int row = 4;
        int col = 4;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if((i==idx[0])||(j==idx[1]))
                {
                    matrix[i][j]=1;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}