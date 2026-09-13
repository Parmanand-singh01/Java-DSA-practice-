class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int l=0,n=nums.length,count=0,product=1;
        for(int r=0;r<n;r++){
            product*=nums[r];
            while(product>=k){
                product/=nums[l];
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
}
