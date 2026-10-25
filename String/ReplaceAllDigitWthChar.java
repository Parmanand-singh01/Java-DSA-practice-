class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<n-1;i+=2){
            int a=s.charAt(i)-'a';
            int b=s.charAt(i+1)-'0';
            int c=(a+b)%26+'a';
            sb.setCharAt(i+1,(char)c);
        }
        return sb.toString();
    }
}
