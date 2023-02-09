public class rotateArrayByKElements {
    static void reverse(int[] arr,int start,int end)
    {
       while(start<=end)
        {   
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void RotateArrayByK(int[] arr,int k)
    {
        //reverse the start to k-1 elements
        reverse(arr, 0, k-1);
        //reverse the k to end elements
        reverse(arr, k,arr.length-1);
        //reverse the array 
        reverse(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int k = 2;
        RotateArrayByK(arr,k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}