class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i+=k){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=s.charAt(j)-'a';
            }
    sb.append((char)(97+sum%26));
        }
        return sb.toString();
    }
}
