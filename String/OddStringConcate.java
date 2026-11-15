class Solution {
    public String oddString(String[] words) {
        int n=words.length;
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
ArrayList<Integer> list=new ArrayList<>();
            String s=words[i];
for(int j=0;j<s.length()-1;j++){
    int a=s.charAt(j)-'a';
    int b=s.charAt(j+1)-'a';
    list.add(b-a);
}
    ans.add(list);
        }
    HashMap<ArrayList<Integer>,Integer> map=new HashMap<>();
        int m=ans.size();
        for(int i=0;i<m;i++){
map.put(ans.get(i),map.getOrDefault(ans.get(i),0)+1);
        }
        ArrayList<Integer> l=null;
for(ArrayList<Integer> i:map.keySet()){
            if(map.get(i)==1){
                l=i;break;
            }
        }int idx=-1;
        for(int i=0;i<m;i++){
            if(ans.get(i).equals(l)){
                idx=i;break;
            }
        }
        return words[idx];
    }
}
