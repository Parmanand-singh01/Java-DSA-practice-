class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        int maxeven=-1;
        for(int i:map.keySet()){
            if(i%2==0){
            if(map.get(i)>max || (map.get(i)==max && i<maxeven) ){
             max=map.get(i) ; 
                maxeven=i;
            }
          }
        }
        if(maxeven==-1) return -1;
        return maxeven;
        
        
    }
}
