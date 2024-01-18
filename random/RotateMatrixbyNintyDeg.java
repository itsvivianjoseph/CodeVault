class RotateMatrixbyNintyDeg
{
    static void rotateByNintyDeg(int[][] arr)
    {
        int[][] res = new int[arr.length][arr.length];
        int c=0,r=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            r=arr.length-1;
            for(int j=0;j<arr[i].length;j++) {
                res[i][j] = arr[r][c];
                r--;
                System.out.print(res[i][j]+" ");
            }
            c++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateByNintyDeg(arr);
    }
}