class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
 HashMap<String,List<String>> map=new HashMap<>();
        for(String c:strs){
            char[]arr=c.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(c);
        }
        return new ArrayList(map.values());
        
    }
}
