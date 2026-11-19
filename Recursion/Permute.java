class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
       fun(nums,0,ans); 
       return ans;
    }
     static void fun(int []nums,int index,List<List<Integer>> ans ){
        if(index==nums.length){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int k:nums){
                temp.add(k);
            }
            ans.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            fun(nums,index+1,ans);
            swap(nums,i,index);
        }
    }
    static void swap(int []nums,int i,int index ){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}
