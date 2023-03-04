//unfinished

import java.util.*;

public class SetRowsAndColumnsToZero {
    static int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
    static void checkZeros()
    {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>(); 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0) {
                    setZerosToRowsAndCols(i,j);
                    return;
                }
            }
        }
    }
    static void setZerosToRowsAndCols(int row,int col)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(row==i || j==col) arr[i][j]=0;
            }
        }
    }
    public static void main(String[] args) {
        checkZeros();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
