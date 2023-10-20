public class BallAvail {
    static int productionHouse(int n, int m, int[] days, int[] needs) {
        int N = days.length;
boolean swapped;

for (int i = 0; i < N - 1; i++) {
    swapped = false;
    for (int j = 0; j < N - i - 1; j++) {
        if (days[j] > days[j + 1]) {
            // Swap days array
            int temp = days[j];
            days[j] = days[j + 1];
            days[j + 1] = temp;

            // Swap needs array (corresponding elements)
            temp = needs[j];
            needs[j] = needs[j + 1];
            needs[j + 1] = temp;

            swapped = true;
        }
    }

    if (!swapped) {
        break;
    }
}

                for (int i : days) {
            System.out.println("days "+i);
        }
        int sum=n;
        for(int i=0;i<days.length;i++){
            sum+=n;
            if(days[i] <= m) {
                sum -= needs[i];
                if(sum<0)
                    return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int result1 = productionHouse(10, 4, new int[] {14, 10, 12, 11, 21, 9, 29, 25, 24, 18, 17, 28, 27, 2, 20},
                new int[] {3, 21, 32, 27, 27, 4, 38, 3, 30, 7, 11, 40, 22, 35, 16});
        System.out.println("Test case 1: " + result1);

        // int result2 = productionHouse(10, 7, new int[] {3, 2, 10, 1, 11, 5, 7},
        //         new int[] {9, 5, 4, 9, 9, 16, 19});
        // System.out.println("Test case 2: " + result2);

        // int result3 = productionHouse(5, 8, new int[] {9, 10, 2, 14, 3, 11, 15, 12},
        //         new int[] {9, 4, 3, 21, 19, 24, 0, 11});
        // System.out.println("Test case 3: " + result3);

        // int result4 = productionHouse(10, 11, new int[] {12, 1, 17, 21, 9, 4, 2, 13, 6, 19, 22},
        //         new int[] {22, 2, 2, 18, 22, 33, 28, 28, 14, 22, 18});
        // System.out.println("Test case 4: " + result4);

        // int result5 = productionHouse(9, 8, new int[] {8, 13, 9, 5, 12, 4, 3, 15},
        //         new int[] {13, 9, 4, 1, 21, 0, 19, 14});
        // System.out.println("Test case 5: " + result5);

        // int result6 = productionHouse(6, 13, new int[] {16, 4, 23, 24, 6, 26, 3, 18, 11, 5, 20, 19, 10},
        //         new int[] {30, 16, 21, 18, 25, 28, 11, 25, 39, 22, 39, 7, 8});
        // System.out.println("Test case 6: " + result6);

        // int result7 = productionHouse(9, 12, new int[] {12, 5, 20, 16, 2, 10, 19, 23, 17, 6, 4, 7},
        //         new int[] {29, 14, 13, 29, 29, 31, 27, 19, 23, 22, 30, 16});
        // System.out.println("Test case 7: " + result7);

        // int result8 = productionHouse(7, 19, new int[] {14, 17, 27, 33, 24, 2, 29, 16, 13, 35, 6, 31, 11, 3, 32, 12, 8, 36, 9},
        //         new int[] {37, 54, 49, 55, 18, 25, 42, 20, 26, 2, 56, 49, 19, 39, 30, 40, 17, 26, 50});
        // System.out.println("Test case 8: " + result8);

        // int result9 = productionHouse(5, 3, new int[] {5, 4, 3}, new int[] {3, 4, 1});
        // System.out.println("Test case 9: " + result9);

        // int result10 = productionHouse(4, 20, new int[] {5, 4, 17, 13, 35, 18, 26, 1, 27, 3, 22, 9, 15, 33, 31, 2, 36, 28, 39, 8},
        //         new int[] {58, 51, 22, 32, 17, 43, 5, 37, 30, 51, 27, 57, 38, 43, 11, 51, 4, 11, 45, 10});
        // System.out.println("Test case 10: " + result10);
    }
}
