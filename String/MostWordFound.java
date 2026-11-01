class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length,max=0;
        for(int i=0;i<n;i++){
            String s[]=sentences[i].split(" ");
        max=Math.max(max,s.length);
        }
        return max;
    }
}
