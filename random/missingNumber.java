import java.util.ArrayList;
import java.util.List;

public class missingNumber {
    static void missing_repeated_number(List<Integer> A) {
        long len = A.size();

        long S = (len * (len + 1) ) / 2;
        long P = (len * (len + 1) * (2 * len + 1) ) / 6;
        long missingNumber = 0, repeating = 0;

        for (int i = 0; i < A.size(); i++) {
            S -= (long)A.get(i);
            P -= (long)A.get(i) * (long)A.get(i);
        }

        missingNumber = (S + P / S) / 2;
        System.out.println(missingNumber);

        repeating = missingNumber - S;

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add((int)repeating);
        ans.add((int)missingNumber);

    } 
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        missing_repeated_number(arr);
    }
}
