class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length,sum=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            sum+=i;
        }
        return sum-n*min;
    }
}
