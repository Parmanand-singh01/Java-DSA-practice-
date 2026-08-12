class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String y="";
        for(String s:words){
            int sum=0;
    for(char t:s.toCharArray()){
        sum+=weights[t-'a'];
            }
        y+=(char)('a'+(25-(sum%26)));
        }
        return y;
    }
}
