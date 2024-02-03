import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fq {
    public static void main(String[] args) {
        int[] array = {2,2,3,4,5,12,2,3,3,3,12};

        // System.out.println("Original Array: ");
        // printArray(array);

        // Apply Bubble Sort
        // bubbleSort(array);

        // System.out.println("\nSorted Array: ");
        // printArray(array);

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<array.length;i++){
            hm.put(array[i], hm.getOrDefault(array[i], 0 ) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            list.add(entry);
        }

        manualsort(list);

        for(Map.Entry<Integer,Integer> entry : list){
            for(int i = 0;i<entry.getValue();i++){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    static void manualsort(List<Map.Entry<Integer, Integer>> list){
        int n = list.size();
        for(int i = 0;i<n-1;i++){
            for(int j = i;j<n;j++){
                if(list.get(i).getValue() < list.get(j).getValue()){
                    Map.Entry<Integer,Integer> temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    // Modified Bubble Sort implementation with specified ranges for i and j
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Utility method to print an array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}