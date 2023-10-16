package others;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
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