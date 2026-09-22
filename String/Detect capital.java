class Solution {
    public boolean detectCapitalUse(String word) {
        char []arr=word.toCharArray();
        int n=arr.length;
        int lcount=0,ucount=0;
        
        for(char u:arr){
        if(Character.isUpperCase(u)) ucount++;
        }
        if(ucount==n) return true;
        
        for(char u:arr){
        if(Character.isLowerCase(u)) lcount++;
        }
        if(lcount==n) return true;
        if(Character.isUpperCase(arr[0])) {
        for(int i=1;i<n;i++){
            if(Character.isUpperCase(arr[i])){
                return false;
            }
        }
            return true;
        }
        return false;
        
    }
}
