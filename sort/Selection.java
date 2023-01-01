//Find the minimum element in the unsorted array and swap it with the element at the beginning.
//The inner loop selects the minimum element in the unsorted array .

class Selection{
    public static void main(String[] args) {
        int[] arr = {5,5,4,3,2,1};
        int n = arr.length;
        //selection sort
        for (int i = 0; i < n - 1; i++) {
        int mini = i;
        for (int j = i + 1; j < n; j++) {
          if (arr[j] < arr[i]) {
            mini = j;
          }
        }
        //swap
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
      }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}