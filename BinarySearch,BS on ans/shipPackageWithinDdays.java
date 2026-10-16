class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo=0,hi=0,ans=0;
        for(int i:weights){
    lo=Math.max(lo,i);
            hi+=i;
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
if(isvalid(mid,weights,days)){
    ans=mid;
    hi=mid-1;
}else lo=mid+1;
        }
        return ans;
    }
       static boolean isvalid(int mid,int[]weights,int days){
 int sum=0,d=1,n=weights.length;
           for(int i=0;i<n;i++){
               sum+=weights[i];
            if(sum>mid){
                d++;
                sum=weights[i];
            }
           }
        return d<=days;
    }
}
