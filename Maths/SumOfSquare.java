class Solution {
    public int sumOfSquares(int[] nums) {int sum=0;
     int n=nums.length;
        for(int i=0;i<n;i++){
            int t=i+1;
            if(n%t==0){
                sum+=nums[i]*nums[i];
            }
        }
        return sum;
    }
}
