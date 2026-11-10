class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
            if(valid(grid,i,j)){
                count++;
            }
                }
            }
        }
        return count;
        
    }
static boolean valid(int grid[][],int i,int j){
    int n=grid.length;
    int m=grid[0].length;
    if(i<0||j<0||i>=n||j>=m){
        return false;
    }
    if(grid[i][j]==1) return true;
    grid[i][j]=1;
    boolean a=valid(grid,i+1,j);
    boolean b=valid(grid,i-1,j);
    boolean c=valid(grid,i,j+1);
    boolean d=valid(grid,i,j-1);
    return a&&b&&c&&d;
}
}
