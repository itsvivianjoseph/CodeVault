//Repeatedly swap 2 adjacent elements if arr[j] > arr[j+1] .
//Here, the maximum element of the unsorted array reaches the end of the unsorted array after each iteration.
//Unlike selection sort, here, sorting is done from the back as shown in the dry run.
//After (N-1) iterations , we get a sorted array.

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2,9,3,6,9,8,2,1};
        int temp;
        for ( int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
