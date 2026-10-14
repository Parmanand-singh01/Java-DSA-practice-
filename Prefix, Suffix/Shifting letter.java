class Solution {
    public String shiftingLetters(String s, int[] shifts) {
    StringBuilder sb=new StringBuilder(s);
        int n=s.length();
    int suffix[]=new int[n];
        suffix[n-1]=shifts[n-1]%26;
     for(int i=n-2;i>=0;i--){
suffix[i]=suffix[i+1]%26+shifts[i]%26;
        }
        for(int i=0;i<n;i++){
            int c=sb.charAt(i)-'a';
            c=(c+suffix[i])%26;
   sb.setCharAt(i,(char)(c+'a'));
        }
     return sb.toString();
    }
}
