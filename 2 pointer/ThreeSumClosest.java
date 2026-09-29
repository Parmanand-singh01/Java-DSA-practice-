class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
 int ans=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
int sum=nums[i]+nums[left]+nums[right];
    int diff=Math.abs(target-sum);
    int diff2=Math.abs(target-ans);
        if(diff<diff2)ans=sum;
        if(sum>target)right--;
        else if(sum<target)left++;
        else return sum;
            }
        } return ans;
    }
}
