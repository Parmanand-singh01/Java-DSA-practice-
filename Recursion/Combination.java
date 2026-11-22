class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
      fun(nums,0,ans,temp,n,k);
        return ans;
    }
    static void fun(int nums[],int index,List<List<Integer>>ans,List<Integer>temp,int n,int k){
        if(index==n){
            if(temp.size()==k)
            ans.add(new ArrayList<>(temp));
            return;
        }
        // not pick
    fun(nums,index+1,ans,temp,n,k);
        // pick
        temp.add(nums[index]);
    fun(nums,index+1,ans,temp,n,k);
        temp.remove(temp.size()-1);
        
    }
}
