import java.util.Arrays;

public class removeduplicates {
    static int findSizeWithoutDup(int[] arr)
    {
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = findSizeWithoutDup(arr);
        for(int i=0;i<=k;i++)
        {
            System.out.println(arr[i]);
        }
    }
}


//DONE THE OPTIMAL SOLUTION --> TWO POINTERS METHOD --> T.C - LOG(N)
// NORMAL METHOD --> COPY ARRAY ELEMENTS INTO HASHSET AND RETURN THE SET.SIZE()