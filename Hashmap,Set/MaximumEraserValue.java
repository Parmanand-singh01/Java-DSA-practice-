class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int l=0;
        int ans=0,sum=0;
 HashMap<Integer,Integer> map=new HashMap<>();
        for( int r=0;r<n;r++){

map.put(nums[r],map.getOrDefault(nums[r],0)+1); sum+=nums[r];
            while(map.get(nums[r])>1){
                map.put(nums[l],map.get(nums[l])-1);
                sum-=nums[l];
                l++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
