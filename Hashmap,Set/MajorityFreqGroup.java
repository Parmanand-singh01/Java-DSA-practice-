class Solution {
    public String majorityFrequencyGroup(String s) {
int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> mapfreq=new HashMap<>();
        int max=-1,maxfreq=0;
        for(char c:s.toCharArray()){
map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i:map.values()){
mapfreq.put(i,mapfreq.getOrDefault(i,0)+1);
        }
        for(int i:mapfreq.keySet()){
            if(mapfreq.get(i)>max||mapfreq.get(i)==max&&i>maxfreq){
              max=mapfreq.get(i);
                maxfreq=i;
            }
            
        }
        String p="";
        for(char i:map.keySet()){
            if(map.get(i)==maxfreq)
            p+=i;
        }
        return p;
    
    }
}
