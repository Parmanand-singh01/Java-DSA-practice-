class Solution {
    public int minElement(int[] nums)
   {
       int minsum=Integer.MAX_VALUE;
       int n=nums.length;
        for(int i=0;i<n;i++){
            int p=nums[i];
            int sum=0;
            while(p>0){
                sum+=p%10;
                p/=10;
            }
            minsum=Math.min(minsum,sum);
        }
        return minsum;
    }
}
