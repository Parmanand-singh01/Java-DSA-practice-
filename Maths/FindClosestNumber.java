class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int m=Math.abs(nums[0]);
        for(int i=1;i<n;i++){
         m=Math.min(m,Math.abs(nums[i]));
        }
        int p=0;
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i])==m)
                p=nums[i];
            if(p>0) break;
    
        }
        return p;
        
    }
}
