public class sortArrayOfZerosOnesTwos 
{
    static int[] sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp; 
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,2,0,1};
        sort(arr);
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}