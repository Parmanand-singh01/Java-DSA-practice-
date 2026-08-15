class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
          max=Math.max(max,nums[i]);
        min=Math.min(min,nums[i]);
        }
        return k*(max-min);
    }
}
