class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
diff=Math.min(diff,nums[i]-nums[i-1]);
        }
        return diff;
    }
}
