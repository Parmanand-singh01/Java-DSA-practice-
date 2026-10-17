class Solution {
    public int scoreOfParentheses(String s) {
    int n=s.length(),count=0,max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
            count--;
    if(i>0&&s.charAt(i-1)=='('){
        max+=1<<count;
            }}
        }
        return max;
    }
}
