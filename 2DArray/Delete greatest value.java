class Solution {
    public int deleteGreatestValue(int[][] grid) {
  int r=grid.length,c=grid[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            Arrays.sort(grid[i]);
        }
        for(int i=0;i<c;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<r;j++){
    max=Math.max(max,grid[j][i]);
            }
            ans+=max;
        }
        return ans;
    }
}
