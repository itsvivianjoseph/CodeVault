import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    static int[] mergeTwoSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;

        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < len1 && idx2 < len2) {
            if (nums1[idx1] < nums2[idx2]) {
                int curr = nums1[idx1];
                if (!(arr.size() > 0 && arr.get(arr.size() - 1) == curr)) {
                    arr.add(nums1[idx1]);
                }
                idx1++;
            } else if (nums2[idx2] < nums1[idx1]) {
                int curr = nums2[idx2];
                if (!(arr.size() > 0 && arr.get(arr.size() - 1) == curr)) {
                    arr.add(curr);
                }
                idx2++;
            } else {
                arr.add(nums1[idx1]);
                idx1++;
                idx2++;
            }
        }

        if (idx1 < len1) {
            for (int i = idx1; i < len1; i++) {
                int curr = nums1[i];
                if (!(arr.size() > 0 && arr.get(arr.size() - 1) == curr)) {
                    arr.add(nums1[i]);
                }
            }
        }

        if (idx2 < len2) {
            for (int i = idx2; i < len2; i++) {
                int curr = nums2[i];
                if (!(arr.size() > 0 && arr.get(arr.size() - 1) == curr)) {
                    arr.add(nums2[i]);
                }
            }
        }

        int[] res = new int[arr.size()];

        idx1 = 0;

        for (Integer i : arr) {
            res[idx1++] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,4,8,10};
        int[] nums2 = {2,3,9};
        int[] res = mergeTwoSortedArrays(nums1, nums2);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}