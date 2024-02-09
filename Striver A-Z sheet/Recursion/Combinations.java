package Recursion;

import java.util.*;

class Combinations {
    static List<List<Integer>> res = new ArrayList<>();
    static Set<List<Integer>> uniqueCombinations = new HashSet<>();

    static void generateAllPairsOfSizeK(int n, int idx, List<Integer> ds, int k) {
        if (ds.size() == k) {
            // Check if the combination is unique before adding
            if (uniqueCombinations.add(new ArrayList<>(ds))) {
                res.add(new ArrayList<>(ds));
            }
            return;
        }

        if (idx == n) {
            return;
        }

        // take
        ds.add(idx);
        generateAllPairsOfSizeK(n, idx + 1, ds, k);
        ds.remove(ds.size() - 1);

        // not take
        generateAllPairsOfSizeK(n, idx + 1, ds, k);
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<Integer> ds = new ArrayList<>();
        generateAllPairsOfSizeK(n + 1, 1, ds, k);
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
