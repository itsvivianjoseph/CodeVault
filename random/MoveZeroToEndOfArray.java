

public class MoveZeroToEndOfArray {
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
    static int[] moveZeroToEnd(int[] arr)
    {
        int count=0;
        mergersort(arr);
        for(int i=0;i<arr.length;i++) if(arr[i]==0) count++;
        RotateArrayByK(arr, count);
        return arr;
    }
    static void mergersort(int[] arr){
        //if size of the array is <2 => one/zero element
        if(arr.length<2) return;
        int len = arr.length;
        int mid = len/2;
        
        //declaring and initalizing the left and right halfs of the array
        int[] left = new int[mid];
        int[] right = new int[len-mid];

        for(int i=0;i<mid;i++){
            left[i] = arr[i];
        }

        for(int i=mid;i<len;i++){
            right[i-mid] = arr[i];
        }

        //merge sort the individual arrays
        mergersort(left);
        mergersort(right);

        //merge
        merge(arr, left, right);
    }

    static void merge(int[] arr,int[] left,int[] right){
        int lsize = left.length;
        int rsize = right.length;
        int i=0,j=0,k=0;
        while((i<lsize)&&(j<rsize)){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<lsize){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<rsize){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,2,0,3};
        moveZeroToEnd(arr);
        for (int i : arr) System.out.print(i+" ");
    }
}
