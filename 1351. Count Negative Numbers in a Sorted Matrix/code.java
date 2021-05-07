class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int j;
        for(int i=0;i<grid.length;i++){
            for(j=0;j<grid[i].length && grid[i][j]>=0 ;j++)
            
            count+=grid[i].length-j;
            }
        return count;
    }
}