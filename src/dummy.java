//You are given two arrays, arr and arr1, each containing integers. 

//Your task is to print the elements from these arrays while following these rules:

// Begin by printing elements from arr1.
// Whenever an element in arr matches an element in arr1, switch to printing elements from arr.
// If there are no matches between arr1 and arr, print all remaining elements from arr1.

// arr  - 2, 3, 7, 10, 12, 9, 16, 18
// arr1 - 1, 5, 7, 8, 9, 11, 13, 14

// op - 1 5 7 10 12 9 16 18
public class dummy {
    static void printArrays(int[] arr,int[] arr1)
    {
        int idx=0;
        int len = arr.length;

        while(idx!=len-1)
        {
            if(arr[idx]==arr1[idx]) {
                for(int i=idx;i<len;i++) System.out.print(arr[i]+" ");
                return;
            }
            else System.out.print(arr1[idx++]+" ");
        }
    }
    public static void main(String[] args) {
        printArrays(new int[] {2, 3, 7, 10, 12, 9, 16, 18}, new int[] {1, 5, 7, 8, 9, 11, 13, 14});
    }
}