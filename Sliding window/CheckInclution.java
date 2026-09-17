class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1tab[]=new int[26];
        int window[]=new int[26];
int l=0,n=s2.length(),k=s1.length();
        for(int i=0;i<k;i++){
     s1tab[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
           // expand
     window[s2.charAt(i)-'a']++;
             if(i-l+1==k){
                //process
 if(Arrays.equals(s1tab, window)){
     return true;
 }
                 //shrink
    window[s2.charAt(l)-'a']--;
                 l++;
                }
        } return false;
    }
}
