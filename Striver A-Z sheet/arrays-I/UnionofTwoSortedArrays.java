import java.util.ArrayList;
import java.util.List;

public class UnionofTwoSortedArrays {
    static int[] union(int[] nums1, int[] nums2) {
        int idx1 = 0;
        int idx2 = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<Integer> res = new ArrayList<Integer>();

        while (idx1 < len1 && idx2 < len2) {
            if (nums1[idx1] < nums2[idx2]) {
                res.add(nums1[idx1]);
                idx1++;
            } else if (nums1[idx1] > nums2[idx2]) {
                res.add(nums2[idx2]);
                idx2++;
            } else if (nums1[idx1] == nums2[idx2]) {
                int currentElement = nums1[idx1];
                res.add(currentElement);
                while (idx1 < len1 && nums1[idx1] == currentElement) {
                    idx1++;
                }
                while (idx2 < len2 && nums2[idx2] == currentElement) {
                    idx2++;
                }
            }
        }

        while (idx1 < len1) {
            res.add(nums1[idx1]);
            idx1++;
        }

        while (idx2 < len2) {
            res.add(nums2[idx2]);
            idx2++;
        }

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 3, 4, 4, 5};
        int[] res = union(nums1, nums2);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}