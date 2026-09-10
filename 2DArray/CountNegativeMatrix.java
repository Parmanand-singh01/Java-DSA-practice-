class Solution {
    public int countNegatives(int[][] grid) {
        int countneg=0,r=grid.length,c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]<0){
                    countneg++;
                }
            }
        }
        return countneg;
    }
}
