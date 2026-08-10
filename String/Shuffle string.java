class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length,max=0;
        for(int i=0;i<n;i++){
        max=Math.max(max,indices[i]);
        }
        HashMap<Integer,Character> map=new HashMap<>();
        for(int i=0;i<n;i++){
 map.put(indices[i],s.charAt(i));
        }
        String p="";
        for(int i=0;i<=max;i++){
            p+=map.get(i);
        }
        return p;
    }
}
