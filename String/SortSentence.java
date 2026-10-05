class Solution {
    public String sortSentence(String s) {String []arr=s.split(" ");
int n=arr.length;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<n+1;i++){
            for(int j=0;j<n;j++){
if(arr[j].charAt(arr[j].length()-1)-'0'==i)sb.append(arr[j].substring(0,arr[j].length()-1)).append(" ");
            }
        } return sb.toString().trim();
    }
}
