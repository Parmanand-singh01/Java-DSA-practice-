class Solution {
    public String removeTrailingZeros(String num) {
        int idx=0;
for(int i=num.length()-1;i>=0;i--){
    if(num.charAt(i)!='0'){
        idx=i;
        break;
    } 
}
    String p=num.substring(0,idx+1);
        return p;
        
    }
}
