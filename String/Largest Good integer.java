class  Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n-2;i++){
                 if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i+1)==num.charAt(i+2)&&num.charAt(i)==num.charAt(i+2)){
    int a=(num.charAt(i)-'0')*100;
    int b=(num.charAt(i+1)-'0')*10;
        int c=num.charAt(i+2)-'0';
        list.add(a+b+c);
                 }
            
        }
        
        if(list.isEmpty()) return "";
        int max=Integer.MIN_VALUE;
        for(int i:list){
            max=Math.max(max,i);
        }
        String s=String.valueOf(max);
    if(s.equals("0")) return "000";
        return s;
    }
}
