package others;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
        public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++) res.add(getRow(i));
        return res;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        long prev = 1;
        for(int k = 1;k<=rowIndex;k++){
            long next_val = prev * (rowIndex - k+1)/k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}

//simple solution
// public class PascalsTriangle {
//         public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> res = new ArrayList();
//         List<Integer> prev = new ArrayList();
//         prev.add(1);
//         res.add(prev);
//         for(int i = 0; i < numRows - 1; i++) {
//             List<Integer> curr = new ArrayList();
//             curr.add(1);
//             for(int j = 0; j < prev.size() - 1; j++) {
//                 curr.add(prev.get(j) + prev.get(j + 1));
//             }
//             curr.add(1);
//             res.add(curr);
//             prev = curr;
//         }
//         return res;
//     }
// }