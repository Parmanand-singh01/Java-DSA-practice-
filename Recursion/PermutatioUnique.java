class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>>ans=new ArrayList<>();
        fun(nums,ans,0);
        HashSet<List<Integer>> set=new HashSet<>();
        for(List<Integer> i:ans){
            set.add(i);
        }
        ans.clear();
        ans.addAll(set);
        
        for(int i=set.size();i<ans.size();i++){
            ans.remove(ans.size()-1);
        }
        return ans;
    }
    static void fun(int []nums,List<List<Integer>> ans,int index){
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int i:nums){
                list.add(i);
            }
            ans.add(list);
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            fun(nums,ans,index+1);
            swap(nums,i,index);
        }
    }
    static void swap(int nums[],int i,int index){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}
