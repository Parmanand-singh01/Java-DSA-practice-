class Solution {
    public int passwordStrength(String password) {
        int sum=0;
StringBuilder sb=new StringBuilder();
for(int i=0;i<password.length();i++){
if(sb.indexOf(String.valueOf(password.charAt(i)))==-1){
    sb.append(password.charAt(i));
    sum+=Strength(password.charAt(i));
}}
        return sum;
    }
    public int Strength(char c){
        if(Character.isUpperCase(c)){
            return 2;
}else if(Character.isLowerCase(c)){
            return 1;
}else if(Character.isDigit(c)){
            return 3;
}else if(!Character.isLetterOrDigit(c)){
            return 5;
}
        return 0;
    }
}
