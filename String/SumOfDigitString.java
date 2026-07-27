class Solution { //1945. Sum of Digits of String After Convert
    public int getLucky(String s, int k) {
        String p="";
        int n=s.length();
        for(int i=0;i<n;i++){
    p+=(s.charAt(i)-'a'+1);
        }
        String t=p;
        for(int i=1;i<=k;i++){
            int y=0;
 for(int j=0;j<t.length();j++){
     y+=t.charAt(j)-'0';
 }
            t=String.valueOf(y);
        }
    int ans=Integer.valueOf(t);
        return ans;
    }
}
