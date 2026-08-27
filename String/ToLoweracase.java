class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder ();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)<=90&&s.charAt(i)>=65){
      sb.append((char)(s.charAt(i)+32));
            }else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
