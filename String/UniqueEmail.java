class Solution {
    public int numUniqueEmails(String[] emails) {
        int n=emails.length;
HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
        String s=emails[i];
            StringBuilder sb=new StringBuilder(s);
        int lo=s.indexOf('+');
        int hi=s.indexOf('@');
            if(lo!=-1&&hi!=-1&&lo<hi)
            sb.delete(lo,hi);

        int l=sb.length();
        String p="";
            for(int j=0;j<l;j++){
              if(sb.charAt(j)=='.'&&sb.indexOf("@")!=-1&&j<sb.indexOf("@")){
                  continue;
              }
            p+=sb.charAt(j);

            }
         
        set.add(p);
        }
    
        
        return set.size();
    }
}
