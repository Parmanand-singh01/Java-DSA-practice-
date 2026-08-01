class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char ch[]=s.toCharArray();
        while(i<j){
            while(i<j&&!"aeiouAEIOU".contains(ch[i]+"")) {i++;}
            while(i<j&&!"aeiouAEIOU".contains(ch[j]+"")) {j--;}
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
        return new String(ch);
    }
}
