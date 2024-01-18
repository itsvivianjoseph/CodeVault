public class consecutiveZeros
{
    static int[] arr = {1,0,0,1,0,1,0,0,0};
    static int max=0;
    static int ip = 3;
    static int countZeros()
    {
        int count=0,maxCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1) {
                for(int j=i+1;j<arr.length;j++) {
                    if(arr[j]==1 && j-i>=ip)
                    {
                        count = j-i+1;
                        if(count>maxCount) maxCount=count;
                        break;
                    }
                }
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(countZeros());
    }
}