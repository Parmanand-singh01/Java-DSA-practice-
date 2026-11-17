class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length(),j=0;
        if(n==0)return true;
        
       for(int i=0;i<m;i++){
        if(j<n&&t.charAt(i)==s.charAt(j)){
            j++;
        }
        if(j==n)return true;
       } 
      
       return false;
    }
}
