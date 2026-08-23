class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> upper=new HashSet<>();
        HashSet<Character> lower=new HashSet<>();
        int count=0,n=word.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))){
         upper.add(word.charAt(i));   
     } else lower.add(word.charAt(i));
        }
        for(char ch:upper){
            char s=(char)(ch+32);
     if(lower.contains(s)){
        int indexl=-1,indexu=-1;
    for(int i=0;i<n;i++){
        if(word.charAt(i)==s) indexl=i;
        if(word.charAt(i)==ch && indexu==-1) indexu=i;    
    }
         if(indexl<indexu) count++;
     }}
        return count;
    }
}
