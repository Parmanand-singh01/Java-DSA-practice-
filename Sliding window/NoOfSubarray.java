class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
 
        return atmostK(nums,k)-atmostK(nums,k-1);
    }
static int atmostK(int []nums,int k){
int n=nums.length,l=0,count=0,odd=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==1){
             odd++;
            }
            while(odd>k){
            if(nums[l]%2==1)odd--;
                l++;
            }
            count+=i-l+1;
            
        } return count;
    }
}
