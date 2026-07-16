class Solution {
    public int kthFactor(int n, int k) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                set.add(i);
            }
        }
        if(set.size()<k) return -1;
        int p=0,ans=-1;
        for(int i:set){
            if(p<k) {
            ans=i;
            p++;}
        }
        
        return ans;
    }
}
