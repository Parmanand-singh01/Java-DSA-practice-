class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int ans[]=new int [n];
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[k++]=nums[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                count++;
            }
        }
        while(count>=1){
                ans[k++]=pivot;
        count--;
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[k++]=nums[i];
            }
        }
        
        return ans;
    }
}
