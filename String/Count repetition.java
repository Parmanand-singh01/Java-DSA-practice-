class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        StringBuilder sb=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
        for(int i=0;i<n1;i++){
     sb.append(s1);
        }
        for(int i=0;i<n2;i++){
sb2.append(s2);
        }
        int count=0;
   int j=0;
for(int i=0;i<sb.length();i++){
 if(sb.charAt(i)==sb2.charAt(j)){
     j++;
    if(j==sb2.length()){
        count++;j=0;
    }
 }
      }
    return count;
    }
}
