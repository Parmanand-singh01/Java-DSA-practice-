class Solution {
    public int findMin(int[] nums) {
        int lo=0,hi=nums.length-1;
        
        while(lo<=hi){
            int mid=lo +(hi-lo)/2;
            if(nums[mid]>=nums[0]) lo=mid+1;
            else {nums[0]=nums[mid];
                hi=mid-1;}
        }
        return nums[0];
    }
}
