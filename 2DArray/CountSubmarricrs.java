class Solution {
    public int countSubmatrices(int[][] grid, int k) {
 int n=grid.length,m=grid[0].length;
        int count=0;
        int ans[]=new int[m];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=grid[i][j];
               ans[j] +=sum;
            if(ans[j]<=k){count++;}
            }
            
            
        } return count;
    }
}
