package Arrays;

public class DeleteGreatestValueinEachRow {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        int strikes = grid.length * grid[0].length;
        int posx = -1 , posy = -1;
        while(strikes!=0){
            // List<Integer> res = new ArrayList<Integer>();
            int max1 = Integer.MIN_VALUE;
            for(int i=0;i<grid.length;i++){
                int max2 = Integer.MIN_VALUE;
                for(int j=0;j<grid[i].length;j++){
                    if(grid[i][j] > max2 && grid[i][j]!=Integer.MIN_VALUE) {
                        max2 = grid[i][j];
                        posx = i;
                        posy = j;
                    }
                }
                // res.add(max);
                grid[posx][posy] = Integer.MIN_VALUE;
                max1 = Math.max(max1,max2);
            }
            // Collections.sort(res);
            // sum += res.get(res.size()-1);
            sum += max1;
            strikes -= grid.length;
        }
        return sum;
    }
}
