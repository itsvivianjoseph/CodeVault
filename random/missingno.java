public class missingno {
    static void findmissingno(int[] arr)
    {
        int n = arr.length-1;
        int missingno = (n*(n+1))/2;
        for (int i = 0; i < arr.length; i++) missingno-=arr[i];
        System.out.println("Missing number is :"+(missingno+1));
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,3,4,6,5,7,8,10};
        findmissingno(arr);
    }
}
