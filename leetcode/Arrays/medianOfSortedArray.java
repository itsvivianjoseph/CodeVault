package Arrays;

public class medianOfSortedArray {
    static int[] mergeArray(int num1[],int num2[])
    {
        int m=0,n=0,i=0;
        int[] arr = new int[num1.length+num2.length];
        while((m<num1.length)&&(n<num2.length))
        {
            if(num1[m]<=num2[n]){
                arr[i]=num1[m];
                m++;
            }else if(num2[n]<=num1[m]){
                arr[i]=num2[n];
                n++;
            }
            i++;
        }
        while(m<num1.length) {
            arr[i] = num1[m];
            i++;
            m++;
        } 
        while(n<num2.length) {
            arr[i] = num2[n];
            i++;
            n++;
        }
        return arr;
    }
    static void findMedian(int[] arr)
    {
        int len=arr.length;
        double median=0;
        if(len%2==0) {
            median=(arr[len/2]+arr[(len/2)-1]);
            median/=2.0;
        }
        else median=arr[len/2];
        System.out.println(median);
    }
    public static void main(String[] args) {
        int[] num1 = {1,3};
        int[] num2 = {2};
        int[] arr = mergeArray(num1,num2);
        findMedian(arr);
    }
}