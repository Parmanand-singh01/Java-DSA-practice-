class Solution { //2309. Greatest English Letter in Upper and Lower Case
    public String greatestLetter(String s) {
        StringBuilder sb=new StringBuilder(s);
      int ans=0;
    for(char i='A';i<='Z';i++){
char t=Character.toLowerCase(i);
if(sb.indexOf(i+"")!=-1&&sb.indexOf(t+"")!=-1){
        ans=i; }
    } if(ans==0) return "";
        return String.valueOf((char)ans);
    }
}
