// //unfinished

// import java.util.*;

// public class SetRowsAndColumnsToZero {
//     static int[][] arr = {{0,1,1},{1,0,1},{1,1,0}};
//     static void checkZeros()
//     {
//         // ArrayList<List<Integer>> res = new ArrayList<List<Integer>>(); 
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr[i].length;j++)
//             {
//                 if(arr[i][j]==0) {
//                     setZerosToRowsAndCols(i,j);
//                     return;
//                 }
//             }
//         }
//     }
//     static void setZerosToRowsAndCols(int row,int col)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(row==i || j==col) arr[i][j]=0;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         checkZeros();
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr[i].length;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


public class SetRowsAndColumnsToZero
{
    static int[][] arr = {{0,1,1},{1,0,1},{1,1,0}};
    public static void main(String[] args) {
        int col0=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0]==0) col0=0;
            for(int j=1;j<arr.length;j++) {
                if(arr[i][j]==0){
                    arr[i][0] = arr[0][j] = 0;
                }
            }
        }

        for (int i = arr.length-1; i >= 0 ; i++) {
            for(int j =arr.length-1;j>=0;j++) {
                if(arr[i][0]==0 || arr[0][j]==0) arr[i][j]=0;
                
            }
        }
    }
}