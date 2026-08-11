class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int []ans=new int[2*n];
            int k=0;
        for(int i=0;i<n;i++){
            ans[k++]=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[k++]=nums[n-i-1];
        }
        return ans;
        
    }
}
