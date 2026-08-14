class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> list =new ArrayList<>();
        int n=nums.length;
        
     for(int i=0;i<n;i++){
          boolean l=true;
         boolean r=true;
        for(int j=0;j<i;j++) {
            if(nums[j]>=nums[i])
                l=false;
        }
         for(int j=i+1;j<n;j++) {
            if(nums[j]>=nums[i])
                r=false;
         }
         if(l||r) list.add(nums[i]);
     }
        return list;
        
    }
}
     
