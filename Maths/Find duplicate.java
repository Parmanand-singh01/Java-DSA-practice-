class Solution {
    public int findDuplicate(int[] nums) { int n=nums.length;
        int freq[]=new int[n];
      for(int i=0;i<n;i++ ){
           freq[nums[i]]++;
        if(freq[nums[i]]>1) return nums[i];
       }      
         return -1;
    }
}
//method 2
class Solution {
    public int findDuplicate(int[] nums) { int n=nums.length;
        Arrays.sort(nums);
        int num=-1;
        int j=nums.length-1;
        for(int i=0;i<n-1;i++){
        if(nums[i]==nums[i+1]){
            num=nums[i];break;
        }
        }
            return num; 
    }
}
// method 3
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
    
        for(int i: map.keySet()){
            if(map.get(i)>1){
                return i;
            }
        }
        return 0;
    }
}
