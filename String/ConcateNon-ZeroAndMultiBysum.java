class Solution { //3754. Concatenate Non-Zero Digits and Multiply by Sum I
    public long sumAndMultiply(int n) {
        String p=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        long sum=0;
    for(int i=0;i<p.length();i++){
        char c=p.charAt(i);
        if(c!='0'){
            sb.append(c);
        }
        sum+=c-'0';
    }
        if(sb.length()==0) return 0;
     long ans=Long.valueOf(sb.toString());
        return ans*sum;
    }
}
