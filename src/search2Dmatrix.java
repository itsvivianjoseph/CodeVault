public class search2Dmatrix {
    static void search(int[][] arr , int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]<=key)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    if(arr[i][j]==key){
                        System.out.println("key found!");
                        return;
                    }
                }
            }
        }
        System.out.println("key not found!");
    }
    // static boolean binarySearch(int[] arr,int key)
    // {
    //     int high = arr.length-1,low = 0;
    //     while(low<=high)
    //     {
    //         int mid = ((high-low)+low)/2;
    //         if(arr[mid]==key) return true;
    //         else if(key>arr[mid]) low=mid;
    //         else high=mid;
    //     }
    //     return false;
    // }
    public static void main(String[] args) {
        int[][] arr ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int key = 10;
        System.out.println(arr[0]);
        search(arr,key);
    }
}
