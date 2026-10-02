class Solution {
    public int countElements(int[] nums) {int count=0,n=nums.length;
        for(int i=0;i<n;i++){
         boolean a=false;
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i]){
                   a=true;break; 
                }
            }
            boolean b=false;
            for(int j=0;j<n;j++){
                if(nums[j]>nums[i]){
                   b=true;break; 
                }
            }
            if(a&&b)count++;
            
        }
          return count;
    }
}
