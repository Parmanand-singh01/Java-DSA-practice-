class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        HashMap<Integer,Integer>freqcount=new HashMap<>();
        for(int f:freq.values()){
            freqcount.put(f,freqcount.getOrDefault(f,0)+1);
        }
        for(int i:nums){
            if(freqcount.get(freq.get(i))==1) return i;
        }
        return -1;
    }
}
