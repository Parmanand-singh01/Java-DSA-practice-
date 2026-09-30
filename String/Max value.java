class Solution {
    public String maxValue(String n, int x) {int p=n.length();
        char c=(char)(x+'0');
        if(n.charAt(0)=='-'){
            for(int i=1;i<p;i++){
          if((x+'0')<n.charAt(i)){
    return n.substring(0,i)+c+n.substring(i);
          }}}else {
            for(int i=0;i<p;i++){
        if((x+'0')>n.charAt(i)){
    return n.substring(0,i)+c+n.substring(i);
        }}}
    return n+c;
    }
}
