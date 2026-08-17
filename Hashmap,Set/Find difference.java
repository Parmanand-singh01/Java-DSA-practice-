class Solution {
    public char findTheDifference(String s, String t) {
     HashMap<Character,Integer> map= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        
        for(char c:map2.keySet()){
            if(!map.containsKey(c) || map2.get(c)>map.getOrDefault(c,0)){
                 return c;
            }
        }
        return ' ';
    }
}
