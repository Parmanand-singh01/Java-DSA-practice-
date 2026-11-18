class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        int n=nums.length;
        fun(nums,temp,ans,0,n);
        return ans;
    }
    public void fun(int []nums,ArrayList<Integer>temp,List<List<Integer>> ans,int index,int n){
        if(index==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //not pick
        fun(nums,temp,ans,index+1,n);
       // pick 
        temp.add(nums[index]);
        fun(nums,temp,ans,index+1,n);
        temp.remove(temp.size()-1);
        
    }
}
