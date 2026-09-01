class Solution {
    public int distributeCandies(int[] can) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:can){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n=can.length;
       return Math.min(map.size(),n/2);
        
    }
}
