class Solution {
    public int matrixSum(int[][] nums) {
        int r=nums.length,c=nums[0].length;
        for(int i=0;i<r;i++){
            Arrays.sort(nums[i]);
        }
        int sum=0;
        for(int j=0;j<c;j++){
            int max=-1;
            for(int i=0;i<r;i++){
     max=Math.max(nums[i][j],max);
            }
            sum+=max;
        }
        return sum;
    }
}
