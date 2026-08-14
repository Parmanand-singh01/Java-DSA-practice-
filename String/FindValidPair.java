class Solution {
    public String findValidPair(String s) {
        String p="";
        int n=s.length();
        
        for(int i=0;i<n-1;i++){
            int count=0,count2=0;
        if(s.charAt(i)!=s.charAt(i+1)){
                int t=s.charAt(i)-'0';
                int q=s.charAt(i+1)-'0';
            char c=s.charAt(i);
            char r=s.charAt(i+1);
                for(int j=0;j<n;j++){
    if(s.charAt(j)==c) count++;
    if(s.charAt(j)==r) count2++;
                }
            if(t==count&&q==count2){
                p+=c;p+=r;
                return p;
            }
            }
            
        }
        return p;
    }
}
