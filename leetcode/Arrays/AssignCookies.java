package Arrays;

import java.util.Arrays;

public class AssignCookies {
        public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int gIndex = 0;
        int sIndex = 0;

        while (gIndex < g.length && sIndex < s.length) {
            if (s[sIndex] >= g[gIndex]) {
                count++;
                gIndex++;
            }
            sIndex++;
        }

        return count;
    }
}
