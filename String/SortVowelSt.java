class Solution {
    public String sortVowels(String s) {
        List<Character> list=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                list.add(c);
            }
        } Collections.sort(list); 
        int k=0;
StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
        if(isVowel(s.charAt(i))){
        sb.setCharAt(i,list.get(k++));
            }
        }
        return sb.toString();
        
    }
    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}
