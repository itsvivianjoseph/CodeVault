public class Search2dMatrix {
    public boolean searchMatrix(int[][] arr, int key) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]<=key)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    if(arr[i][j]==key){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
