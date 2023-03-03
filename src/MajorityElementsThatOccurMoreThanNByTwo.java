import java.util.Arrays;

public class MajorityElementsThatOccurMoreThanNByTwo {
    // static int MajorityElement(int[] arr)
    // {
    //     int count=0,max_count=0,pos=0;
    //     Arrays.sort(arr);
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         if(arr[i]==arr[i+1]) count++;
    //         if(count>max_count) {
    //             max_count=count;
    //             pos=i;
    //         }
    //     }
    //     return pos; 
    // }

    //moore voting algo
    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if(num==candidate)
            count += 1; 
            else count -= 1; 
        }

        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {4,4,2,4,3,4,4,3,2,4};
        System.out.println(majorityElement(arr));
    }
}
