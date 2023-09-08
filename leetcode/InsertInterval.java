import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    
        public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        
        // Add intervals that end before newInterval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        
        // Add the merged newInterval
        result.add(newInterval);
        
        // Add intervals that start after newInterval ends
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        // Convert the list to a 2D array
        int[][] mergedIntervals = new int[result.size()][2];
        for (int j = 0; j < result.size(); j++) {
            mergedIntervals[j] = result.get(j);
        }
        
        return mergedIntervals;
    }

}
// static int countElements(int[][] array, int endRow, int endCol) { return (endCol==1) ? (endRow+1)*2 : ((endRow+1)*2 )-1; }

// static int[] binarySearchStart(int[][] arr, int key) {
//     for (int i = 0; i < arr.length; i++) {
//         if (arr[i][arr[i].length - 1] >= key) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] >= key) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//     }
//     return new int[]{-1};
// }

// static int[] binarySearchEnd(int[][] arr, int key) {
//     for (int i = arr.length - 1; i >= 0; i--) {
//         if (arr[i][0] <= key) {
//             for (int j = arr[i].length-1; j>=0; j--) {
//                 if (arr[i][j] <= key) {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//     }
//     return new int[]{-1};
// }

// public int[][] insert(int[][] arr, int[] newarr) {
    
//     int[] start = new int[2];
//     int[] end = new int[2];
    
//     start = binarySearchStart(arr, newarr[0]);
//     end = binarySearchEnd(arr, newarr[1]);
//     // System.out.println("Start Index: " + start[0] + ", " + start[1]);
//     // System.out.println("End Index: " + end[0] + ", " + end[1]);

//     int no = (countElements(arr, end[0],end[1]) -  countElements(arr, start[0],start[1]))+1; 
//     // System.out.println(no);
//     int total = arr.length*2; 
//     int rem = total - no;
//     boolean flag = true;

//     int[][] res;
//     int m = 0, n = 0;
    
//     if (rem % 2 == 0) {
//         res = new int[rem / 2][2];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (i == start[0] && j == start[1]) {
//                     flag = false;
//                 }
//                 if (flag == true) {
//                     res[m][n % 2] = arr[i][j];
//                     n++;
//                     // System.out.print(arr[i][j] + " ");
//                     if (n % 2 == 0) {
//                         m++; // Move to the next row of the 2-column matrix
//                     }
//                 }
//                 if (i == end[0] && j == end[1]) {
//                     flag = true;
//                 }
//             }
//         }
//     } else {
//         res = new int[(rem + 1) / 2][2];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (i == start[0] && j == start[1]) {
//                     res[m][n % 2] = newarr[n%2];
//                     n++;
//                     System.out.print(arr[start[0]][start[1]] + " ");
//                     if (n % 2 == 0) {
//                         m++;
//                     }
//                     flag = false;
//                 }
//                 if (flag == true) {
//                     res[m][n % 2] = arr[i][j];
//                     n++;
//                     // System.out.print(arr[i][j] + " ");
//                     if (n % 2 == 0) {
//                         m++;
//                     }
//                 }
//                 if (i == end[0] && j == end[1]) {
//                     flag = true;
//                 }
//             }
//         }
//     }
//     return res;
// }

// public static void main(String[] args) {
//     int[][] arr = {
//         {1, 2},
//         {3, 5},
//         {6, 7},
//         {8, 10},
//         {12, 16}
//         // {1,3},
//         // {6,9}
//     };
//     int[] interval = {4,8};
//     InsertInterval obj = new InsertInterval();
//     int[][] x = obj.insert(arr, interval);
//     System.out.println("x");
//     for(int i=0;i<x.length;i++)
//     {
//         for(int j=0;j<x[i].length;j++)
//         {
//             System.out.print(x[i][j]+" ");
//         }
//         System.out.println();
//     }
// }