// package Arrays;

// public class FindinMountainArray {
//     interface MountainArray {
//         // public int get(int index) {}
//         // public int length() {}
//     }
//     public int findInMountainArray(int target, MountainArray mountainArr) 
//     {
//         int len = mountainArr.length();
//         if (len < 3) return -1;

//         int left = 0, right = len - 1;
//         int peak = -1;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             int key0 = mountainArr.get(mid - 1);
//             int key1 = mountainArr.get(mid);
//             int key2 = mountainArr.get(mid + 1);
//             if (key1 > key2 && key1 > key0) {
//                 peak = mid;
//                 break; 
//             } else if (key0 > key1) {
//                 right = mid;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         int pos = -1;
//         left = 0;
//         right = peak;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             int key = mountainArr.get(mid);
//             if (key == target) {
//                 pos = mid;
//                 break; 
//             } else if (key > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         if (pos != -1) {
//             return pos;
//         }

//         left = peak;
//         right = len - 1;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             int key = mountainArr.get(mid);
//             if (key == target) {
//                 pos = mid;
//                 break;
//             } else if (key > target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return pos;
//     }
// }