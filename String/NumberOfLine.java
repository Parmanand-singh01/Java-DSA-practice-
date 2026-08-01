class Solution {
    public int[] numberOfLines(int[] widths, String s) {
      int sum=0,count=1;
        for(char c:s.toCharArray()){
        if(sum+widths[c-'a']>100){
            count++;sum=widths[c-'a'];
           } else sum+=widths[c-'a'];
        }
        return new int[]{count,sum};
    }
}
