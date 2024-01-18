public class countSumPairs 
{
    static boolean binarySearch(int arr[],int key)
    {
        int start = 0,end = arr.length,mid;
        while(start<end)
        {
            mid = (start+end)/2;
            if(arr[mid]==key) return true;
            else if(arr[mid]>key) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
    static void countSumPair(int[] num1,int[] num2,int target)
    {
        int sumCount=0;
        for(int i=0;i<num1.length;i++) if(binarySearch(num2, target-num1[i])) sumCount++;
        System.out.println(sumCount);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        int target = 6;
        countSumPair(arr1,arr2,target);
    }
}