import java.util.Random;
class Mergesorting{
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
        int[] arr = new int[100000000];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(100000000);
        }
        mergersort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}