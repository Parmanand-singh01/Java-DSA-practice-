class Solution {
    public String reverseWords(String s) {
    String arr[]=s.split(" ");
StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
        StringBuilder sb2=new StringBuilder(arr[i]);
            sb2.reverse().append(" ");
            sb.append(sb2.toString());
        }
        return sb.toString().trim();
    }
}
