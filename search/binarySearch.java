public class binarySearch {
    public static boolean BinarySearch(int[] arr,int key)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==key) return true;
            else if(key>arr[mid]) low=mid+1;
            else high=mid; 
        }
        return false;
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        System.out.println(BinarySearch(arr,6));
    }
}
