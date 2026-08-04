class Solution {
    public int maxNumberOfBalloons(String text) {
        String word="balloon";
        int txtfreq[]=new int[26];
        int wordfreq[]=new int[26];
    for(char c:text.toCharArray()){
            txtfreq[c-'a']++;
        }
    for(char c:word.toCharArray()){
            wordfreq[c-'a']++;
        }
        int count=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
         if(wordfreq[i]==0) continue;
     count=Math.min(count,txtfreq[i]/wordfreq[i]);
        }
        return count;
    
    }
}
