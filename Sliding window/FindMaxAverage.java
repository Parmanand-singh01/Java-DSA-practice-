class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int l=0,ans=Integer.MIN_VALUE,sum=0,n=nums.length;
       for(int r=0;r<n;r++){
        sum+=nums[r];
        if(r-l+1==k){
         ans=Math.max(ans,sum);
         sum-=nums[l];
         l++;
        }
       } 
       return (double)ans/k;
    }
}
