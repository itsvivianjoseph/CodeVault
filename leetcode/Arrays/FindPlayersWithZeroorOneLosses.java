package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindPlayersWithZeroorOneLosses {
        public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];

        for (int i = 0; i < matches.length; i++) {
            int win = matches[i][0];
            int loss = matches[i][1];

            if (losses[win] == 0) {
                losses[win] = -1;
            } 

            if (losses[loss] == -1) {
                losses[loss] = 1;
            } else {
                losses[loss]++;
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < losses.length; i++) {
            if (losses[i] == -1) {
                zeroLoss.add(i);
            } else if (losses[i] == 1) {
                oneLoss.add(i);
            }
        }

        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }

    // public List<List<Integer>> findWinners(int[][] matches) {
    //     Map<Integer, Integer> winCount = new HashMap<>();

    //     for (int[] match : matches) {
    //         winCount.put(match[0], winCount.getOrDefault(match[0], 0) + 1);
    //         winCount.put(-match[1], winCount.getOrDefault(-match[1], 0) + 1);
    //     }

    //     List<Integer> noLoss = new ArrayList<>();
    //     List<Integer> oneLoss = new ArrayList<>();

    //     for (int key : winCount.keySet()) {
    //         int value = winCount.get(key);

    //         if (key < 0 && value == 1) {
    //             oneLoss.add(-key);
    //         } else if (key > 0 && value >= 1 && !winCount.containsKey(-key)) {
    //             noLoss.add(key);
    //         }
    //     }

    //     Collections.sort(noLoss);
    //     Collections.sort(oneLoss);

    //     return Arrays.asList(noLoss, oneLoss);
    // }
}
