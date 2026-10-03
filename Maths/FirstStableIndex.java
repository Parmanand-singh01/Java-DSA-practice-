class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length,idx=-1;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
int max=Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
    max=Math.max(max,nums[j]);
            }
int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
    min=Math.min(min,nums[j]);     
            }
        int diff=max-min;
if(diff<=k&&diff<small){
    small=max-min;
    idx=i;break;
}
        }
        return idx;
    }
}
