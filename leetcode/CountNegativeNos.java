class CountNegativeNos {
    static int countNegatives(int[][] grid) {
        int totalCount = 0;
        for(int i=0;i<grid.length;i++)
        {
            totalCount+=binarySearch(grid[i]);
        }
        return totalCount;
    }
    static int binarySearch(int[] arr)
    {
        int left = 0 , right = arr.length-1, count=0;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid]<0) {
                count = arr.length-mid;
                right = mid-1;
            }
            else { 
                left = mid+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
}