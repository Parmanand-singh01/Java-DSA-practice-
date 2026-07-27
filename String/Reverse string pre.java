class Solution {
    public String reversePrefix(String s, int k) {
        char c[]=s.toCharArray();
        
    for(int i=0;i<c.length;i+=k){
         int j=i;
    int p=Math.min(c.length-1,k-1);
         while(j<p){
             char temp=c[j];
             c[j]=c[p];
             c[p]=temp;
             j++;p--;
         }
    }
        return new String(c);
    }
}
