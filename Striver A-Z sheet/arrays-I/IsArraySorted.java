public class IsArraySorted {
    static boolean checkIsSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is the array sorted? \n" + (checkIsSorted(new int[]{1, 2, 3, 4, 5}) ? "yes" : "no"));
    }
}